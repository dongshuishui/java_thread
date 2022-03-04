package com.dongshuishui;

public class YieldTest {
    public static void main(String[] args) {
        MyRun myRun = new MyRun();
        Thread thread = new Thread(myRun);
        thread.start();
        for(int i = 0 ; i< 5; i++){
            if(i ==2){
                System.out.println(Thread.currentThread().getName()+"==================="+i+"礼让一次");
                thread.stop();
            }else {
                System.out.println(Thread.currentThread().getName() +"========"+i);
            }
        }
    }
}
