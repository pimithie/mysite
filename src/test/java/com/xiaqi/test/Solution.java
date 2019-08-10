package com.xiaqi.test;

import org.junit.Test;

import java.util.*;

/**
 * @author xiaqi
 * @date 2019/8/10
 */
class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        char[][] board = new char[][]{
                {'5','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},
                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'}
        };
        solution.solveSudoku(board);
        for (int i = 0;i<9;i++) {
            Arrays.toString(board[i]);
            System.out.println();
        }
    }

    private List<Set<Character>> rowStat = new ArrayList<>();

    private List<Set<Character>> colStat = new ArrayList<>();

    private List<Set<Character>> minSqrStat = new ArrayList<>();

    public void solveSudoku(char[][] board) {
        // initialize
        for (int i = 0;i<9;i++) {
            Set<Character> row = new HashSet<>();
            Set<Character> col = new HashSet<>();
            Set<Character> minSqr = new HashSet<>();
            for (int j = 0;j<9;j++) {
                row.add((char)('1'+j));
                col.add((char)('1'+j));
                minSqr.add((char)('1'+j));
            }
            rowStat.add(row);
            colStat.add(col);
            minSqrStat.add(minSqr);
        }
        for (int row = 0;row<9;row++) {
            Set<Character> set = rowStat.get(row);
            for (int i = 0;i<9;i++) {
                if ('.' != board[row][i]) {
                    set.remove(board[row][i]);
                }
            }
        }
        for (int col = 0;col<9;col++) {
            Set<Character> set = colStat.get(col);
            for (int i = 0;i<9;i++) {
                if ('.' != board[i][col]) {
                    set.remove(board[i][col]);
                }
            }
        }
        int current = 0;
        for (int i = 0;i<9;i+=3) {
            for (int j = 0;j<9;j+=3) {
                Set<Character> set = minSqrStat.get(current++);
                for (int k = i;k<i+3;k++) {
                    for (int m = j;m<j+3;m++) {
                        if ('.' != board[k][m]) {
                            set.remove(board[k][m]);
                        }
                    }
                }
            }
        }
        doFinishSudoku(board);
    }

    private boolean doFinishSudoku(char[][] board) {
        // base case
        if (checkFinish()) {
            return true;
        }
        for (int i = 0;i<9;i++) {
            for (int j =0;j<9;j++) {
                if ('.' == board[i][j]) {
                    for (int target = 0;target<9;target++) {
                        int tmp;
                        if (rowStat.get(i).contains((char)(target+'1'))
                                && colStat.get(j).contains((char)(target+'1'))
                                && minSqrStat.get((tmp = (i/3)*3+(j/3))).contains((char)(target+'1'))) {
                            rowStat.get(i).remove((char)(target+'1'));
                            colStat.get(j).remove((char)(target+'1'));
                            minSqrStat.get(tmp).remove((char)(target+'1'));
                            board[i][j] = (char)(target+'1');
                            if (doFinishSudoku(board)) {
                                return true;
                            }
                            board[i][j] = '.';
                            rowStat.get(i).add((char)(target+'1'));
                            colStat.get(j).add((char)(target+'1'));
                            minSqrStat.get(tmp).add((char)(target+'1'));
                        }
                    }
                    return false;
                }
            }
        }
        return false;
    }

    private boolean checkFinish() {
        for (Set<Character> set: rowStat) {
            if (0 != set.size()) {
                return false;
            }
        }
        for (Set<Character> set: colStat) {
            if (0 != set.size()) {
                return false;
            }
        }
        for (Set<Character> set: minSqrStat) {
            if (0 != set.size()) {
                return false;
            }
        }
        return true;
    }
}
