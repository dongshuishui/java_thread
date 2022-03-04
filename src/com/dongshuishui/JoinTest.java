package com.dongshuishui;

public class JoinTest {
    public static void main(String[] args) {
        MyRun myRun = new MyRun();
        Thread thread = new Thread(myRun);
        thread.start();
        for(int i = 0 ; i< 5 ; i++){
            System.out.println(Thread.currentThread().getName()+"==========="+i);
             if(i == 3){
                 try {
                     thread.join();
                 } catch (InterruptedException e) {
                     e.printStackTrace();
                 }
             }
        }
    }
}
