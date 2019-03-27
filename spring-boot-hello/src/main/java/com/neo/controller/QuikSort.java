package com.neo.controller;

import java.util.Arrays;

public class QuikSort {
    public static void main(String[] args) {

        //冒泡排序
        int  arr[] = {20,5,9,52,7,2,811};
        quikSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    // 快速排序
    public  static  void quikSort(int[] arr, int left, int right){
        // 先把数组中的第一个数当做基数  ，然后先从右至左往左边找到比基数小的值，找到的话停下来，
        // 在从左边从左至右找到比基数大的值，找打的话，停下来，进行交换
        // 如果两个索引 i j遇到了，就将i位置的数值与基数进行交换
        // 此时 基数左边的都是小于基数的值 右边的都是大于基数的值 然后左右两边各进行递归排序

        //  首先进行判断，如果左边的索引大于右边的索引 不合法
        if (left > right) {
            return ;

        }
        // 定义 基数
        int base = arr[left];

        // 定义 索引 i 指向最左边
        int i = left;
        // 定义 索引 j 指向最右边
        int j = right;

        int temp;
        // 当I和j不相遇的时候 就在while中进行循环
        while (i != j){

            // 当右边的数 大于基数的时候  就继续检索
            while(arr[j] >= base && i<j){
                j--;
            }

            // 当左边的数 小于基数的时候  就继续检索
            while(arr[i] <= base && i<j){
                i++;
            }

            //  代码走到 这里 i和j都停了下来 然后交换位置
             temp = arr[j];
             arr[j] = arr[i];

            arr[i] = temp;
        }

        //  如果上面的whlie不执行了 说明i j相遇了
        //  那么i位置上的数据 与 基数 进行交换
        temp = arr[i];
        arr[i] = arr[left];
        arr[left] = temp;

        // 对左边的数据 进行递归
        quikSort(arr,left,i-1);
        // 对右边的数据 进行递归
        quikSort(arr,j+1,right);

    }
}
