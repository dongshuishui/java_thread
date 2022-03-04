package com.dongshuishui.test.demo;




public class ThreadDemo extends Thread{
    @Override
    public void run() {
        System.out.println("dongshuishui:"+Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        Thread thread = new ThreadDemo();
        for(int i =0 ; i < 5 ; i++){
            System.out.println("dongshuishuis1:"+Thread.currentThread().getName());
            thread.start();
        }


    }
}
