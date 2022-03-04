package com.dongshuishui.ticket;

import com.dongshuishui.demo.RunnableDemo;

public class ThreadTest1 {
    public static void main(String[] args) {
        ThreadMethod threadMethod = new ThreadMethod();
        RunnableMethod runnableMethod = new RunnableMethod();
        Thread thread = new Thread(runnableMethod);
        threadMethod.start();
        thread.start();
    }
}

class ThreadMethod extends Thread{
    @Override
    public void run() {
        for(int i = 1 ; i <=100; i++){
            if(i % 2 ==0){
                System.out.println("方式一："+i);
            }
        }
    }
}

class RunnableMethod implements Runnable{

    @Override
    public void run() {
        for(int i = 1 ; i <=100; i++){
            if(i % 2 ==0){
                System.out.println("方式二："+i);
            }
        }
    }
}
