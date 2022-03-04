package com.dongshuishui.test;

public class DongshuishuiRun implements Runnable{

    @Override
    public void run() {
        for(int i = 0 ; i < 5; i++){
            System.out.println(Thread.currentThread().getName()+":  第"+i+"次");
        }
    }
}
