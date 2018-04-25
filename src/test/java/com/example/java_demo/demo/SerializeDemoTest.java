package com.example.java_demo.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest(classes = SerializeDemo.class)
public class SerializeDemoTest {
    private int[] arr={1,9,4,3,6};
    private int[] arr1={1,3,4,6,9};
    @Test
    public void toSort1() throws Exception {
        int[] arr2=SerializeDemo.toSort1(arr);
        assertArrayEquals(arr1,arr2);
    }

    @Test
    public void toSort2() throws Exception {
        List list=SerializeDemo.toSort2(arr);
        for (Object o:list){
            System.out.println(o.toString());
        }
    }

    @Test
    public void toSort3() throws Exception{
        int[] arr3=SerializeDemo.toSort3(arr);
        assertArrayEquals(arr1,arr3);
    }

}