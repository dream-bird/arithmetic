package com.lzx;

/**
 * @ClassName: recursion
 * @Description: 递归算法
 * @author: liuzhongxian
 * @date: 2020/7/23
 */
public class Recursion {
    public int couversion(int n){
        if (n <= 2){
            return n;
        }
        return couversion(n-1) + couversion(n-2);
    }
}
