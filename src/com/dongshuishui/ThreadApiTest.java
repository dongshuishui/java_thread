package com.dongshuishui;

public class ThreadApiTest {
    public static void main(String[] args) {
        PrintIntegerA printIntegerA = new PrintIntegerA();
        PrintIntegerB printIntegerB = new PrintIntegerB();
        Thread threadA = new Thread(printIntegerA);
        Thread threadB = new Thread(printIntegerB);
        threadA.start();
        threadB.start();
    }
}

class PrintIntegerA implements  Runnable{

    @Override
    public void run() {
        for(int i =1 ; i <=10; i++){
            System.out.println("线程A:"+i);
            try {
                Thread.sleep(2010);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class PrintIntegerB implements  Runnable{

    @Override
    public void run() {
        for(int i= 10 ; i>= 1 ; i--){
            System.out.println("线程B:"+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
