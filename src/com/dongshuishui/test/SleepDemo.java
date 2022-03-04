package com.dongshuishui.test;

public class SleepDemo {
    public static void main(String[] args) {
        Thread thread = new Thread(DongshuishuiRun::new);
//       thread.start();
        Thread thread1 = new Thread(new DongshuishuiRun());
        thread1.start();
        for (int i = 0 ; i < 6; i++){
            System.out.println(Thread.currentThread().getName()+":第"+i+"次");
            if(i == 3){
                try {
                    thread1.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
