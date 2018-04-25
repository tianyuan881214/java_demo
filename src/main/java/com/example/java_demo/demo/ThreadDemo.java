package com.example.java_demo.demo;


public class ThreadDemo extends Thread{
    private int i;

    public ThreadDemo(int i) {
        this.i = i;
    }

    @Override
    public void run() {
        System.out.println(++i);
    }

}
