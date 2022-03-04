package com.dongshuishui.ticket;

public class TicketRunnable implements Runnable {
    private int ticket = 5;
    @Override
    public void run() {
        for(int i =0 ; i< 100; i++){
            if(ticket > 0){
                System.out.println(Thread.currentThread().getName()+"正在出售第"+(ticket--)+"张票");
             }
        }
    }

    public static void main(String[] args) {
        TicketRunnable ticketRunnable = new TicketRunnable();
        Thread thread1 = new Thread(ticketRunnable);
        Thread thread2 = new Thread(ticketRunnable);
        Thread thread3 = new Thread(ticketRunnable);
        Thread thread4 = new Thread(ticketRunnable);
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
    }
}
