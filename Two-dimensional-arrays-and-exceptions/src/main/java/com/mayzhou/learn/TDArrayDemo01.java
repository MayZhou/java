package com.mayzhou.learn;

import java.util.Arrays;

/**
 * @Auther: MayZhou
 * @Date: 19/1/15 04:41
 * @Description:
 * @copyright:
 * @version:
 */
public class TDArrayDemo01 {
    public static void main(String[] args) {
        int[][] arr = new int[3][4];
        System.out.println("数组对象: " + arr);
        System.out.println("数组长度: " + arr.length);
        System.out.println("数组第零列" + arr[0]);
        System.out.println("数组第零列的长度: " + arr[0].length);
        System.out.println("数组转为字符串: " + Arrays.toString(arr));
        System.out.println("数组第零列转为字符串:  " + Arrays.toString(arr[0]));
    }
}
