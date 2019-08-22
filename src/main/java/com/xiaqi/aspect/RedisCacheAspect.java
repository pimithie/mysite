package com.xiaqi.aspect;

import com.sun.org.apache.xalan.internal.xsltc.compiler.util.ResultTreeType;
import com.xiaqi.annotation.EnableCache;
import com.xiaqi.entity.Article;
import org.apache.ibatis.executor.ReuseExecutor;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ZSetOperations;
import org.springframework.stereotype.Component;
import com.xiaqi.bean.Constant;
import java.util.Set;
import static com.xiaqi.bean.Constant.GET_ALL_ARTICLES;

/**@author xiaqi
 *@date 2019/8/13
 */

@Aspect
@Component
public class RedisCacheAspect {

    @Autowired
    private RedisTemplate<String,Object> redisTemplate;

    @Pointcut("@annotation(enableCache)")
    public void pointCut(EnableCache enableCache) {}

    @Around("pointCut(enableCache)")
    public Object around(ProceedingJoinPoint proceedingJoinPoint,EnableCache enableCache) throws Throwable {
        //TODO:先尝试从redis缓存中取数据
        // 不开启缓存，直接放行
        if (!enableCache.value()) {
            return proceedingJoinPoint.proceed();
        }
        String methodName = proceedingJoinPoint.getSignature().getName();
        if (GET_ALL_ARTICLES.equals(methodName)) {
            Set<Object> cache = redisTemplate.opsForZSet().range(GET_ALL_ARTICLES, 0L, -1L);
            if (cache.size() != 0) {
                return cache;
            } else {
                Set<Article> result = (Set<Article>) proceedingJoinPoint.proceed();
                ZSetOperations<String, Object> zSetOperations = redisTemplate.opsForZSet();
                for (Article article : result) {
                    zSetOperations.add(GET_ALL_ARTICLES,article,0.0);
                }
                return result;
            }
        }
        return proceedingJoinPoint.proceed();
    }

}
