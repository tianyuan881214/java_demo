package com.example.java_demo.demo;

import java.util.Iterator;
import java.util.List;

public class ListDemo {
    public static void forList(List<String> list){
        //增强for循环
        for(String str:list){
            System.out.println(str);
        }
        //遍历器遍历
         Iterator<String> iterable=list.iterator();
        while(iterable.hasNext()){
            System.out.println(iterable.next());
        }

    }
}
