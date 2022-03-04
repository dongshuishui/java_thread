package com.dongshuishui.ticket;

public class TicketRunnable2 implements Runnable {

    private int ticket = 5;
    @Override
    public void run() {
        for(int i = 0 ; i< 5 ; i++){
            /*try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }*/
            synchronized (this){
                if(ticket > 0){
                    System.out.println(Thread.currentThread().getName() + "正在出售第"+(ticket--)+"张票");
                }

            }
        }
    }

    public static void main(String[] args) {
        TicketRunnable2 ticketRunnable2 = new TicketRunnable2();
        Thread thread1 = new Thread(ticketRunnable2,"A");
        Thread thread2 = new Thread(ticketRunnable2,"B");
        Thread thread3 = new Thread(ticketRunnable2,"C");
        Thread thread4 = new Thread(ticketRunnable2,"D");

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
    }
}
