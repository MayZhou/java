package com.mayzhou.learn;

/**
 * @Auther: MayZhou
 * @Date: 19/1/15 05:20
 * @Description:
 * @copyright:
 * @version:
 */
public class TDArrayDemo02 {
    public static void main(String[] args) {
        //如果二维数组中一维数组的元素个数不确定
         int[][] arr1 = new int[3][];
        int[][] arr = new int[][]{{2, 3}, {5, 2, 1}, {10, 45, 22, 54}};
        //遍历arr
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        //赋值：给arr中的第1个元素修改值
        arr[1] = new int[2];
        //给arr[0]中的第0个元素修改值
        arr[0][0] = 10;
        //遍历arr[0]
        for (int i = 0; i < arr[0].length; i++) {
            System.out.println(arr[0][i]);
        }
        //二维数组的遍历：嵌套for循环
        // 简单for循环
        for (int i = 0; i < arr.length; i++) {
            int[] subArr = arr[i];
            for (int j = 0; j < subArr.length; j++) {
                System.out.println(subArr[j]);
            }
        }
        //增强for循环
        for (int[] subArr1 : arr) {
            for (int n : subArr1) {
                System.out.println(n);
            }
        }
    }
}

