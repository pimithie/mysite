package com.xiaqi.aspect;

import com.xiaqi.annotation.EnableCache;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

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
        System.out.println("redis aspect");
        System.out.println("尝试从redis缓存中取数据");
        return proceedingJoinPoint.proceed();
    }

}
