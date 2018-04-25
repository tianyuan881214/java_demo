package com.example.java_demo.demo;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SerializeDemo {

    public static int[] toSort1(int[] arr){
        Arrays.sort(arr);
        return arr;
    }

    public static List toSort2(int[] arr){
        List list=Arrays.asList(arr);
        Collections.sort(list);
        return list;
    }
    public static int[] toSort3(int[] arr){
        for (int i=0;i<arr.length-1;i++){
            for(int k=0;k<arr.length-i-1;k++){
                if(arr[k]>arr[k+1]){
                    int temp=arr[k];
                    arr[k]=arr[k+1];
                    arr[k+1]=temp;
                }
            }
        }
        return arr;
    }
}
