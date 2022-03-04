package com.dongshuishui.test;

public class JoinTest {

    public static void main(String[] args) {
        DongshuishuiRun dongshuishuiRun = new DongshuishuiRun();
        Thread thread = new Thread(dongshuishuiRun  );
        thread.start();
        for(int i = 0 ; i < 5; i++){
            System.out.println(Thread.currentThread().getName()+": 第"+i+"次");
            if (i == 3){
                try {
                    thread.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
