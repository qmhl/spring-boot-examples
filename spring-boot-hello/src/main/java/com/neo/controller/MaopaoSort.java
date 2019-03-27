package com.neo.controller;

import java.util.Arrays;

public class MaopaoSort {

    public static void main(String[] args) {
        //冒泡排序
        int  arr[] = {20,5,9,52,7,2,811};
        maoPaoSort(arr);
        System.out.println(Arrays.toString(arr));


    }

    public static void maoPaoSort(int[] arr) {
        int temp;//定义一个临时变量

        for(int i=0;i<arr.length-1;i++){//选择的趟数
                //  拿第一个数与后面的每个数作比较，把最小的放在首位
                for(int j= i+1; j < arr.length; j++){
                if(arr[j]<arr[i]){
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }
}
