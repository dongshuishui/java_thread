package com.dongshuishui.ticket;

public class Account implements  Runnable {

    private int money = 1000;

    private int getMoney = 600;
    public Account(){
    }
    @Override
    public void run() {
        /*synchronized(this){
            if(money > getMoney){
                money -=getMoney;
                System.out.println(Thread.currentThread().getName()+"取钱："+getMoney);
            }else {
                System.out.println(Thread.currentThread().getName()+"取钱："+getMoney+",但账户里面钱只有"+money);
            }
        }*/
        getMe();
    }

    public synchronized void getMe(){
        if(money > getMoney){
            money -=getMoney;
            System.out.println(Thread.currentThread().getName()+"取钱："+getMoney);
        }else {
            System.out.println(Thread.currentThread().getName()+"取钱："+getMoney+",但账户里面钱只有"+money);
        }
    }

    public static void main(String[] args) {
        Account account = new Account();
        Thread thread1 = new Thread(account,"妻子");
        Thread thread2 = new Thread(account,"张三");
        thread2.start();
        thread1.start();
    }


}
