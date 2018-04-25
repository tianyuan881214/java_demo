package com.example.java_demo.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest(classes = ListDemo.class)
public class ListDemoTest {
    @Test
    public void forList() throws Exception {
        List<String>list=new ArrayList<>();
        ListDemo.forList(list);
//        list.add("app");
//        ListDemo.forList(list);
    }

}