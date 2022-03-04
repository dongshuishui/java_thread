package com.dongshuishui;

public class ThreadApiDemo implements Runnable{
    public static void main(String[] args) {
        execrise1();
    }
    public static void execrise1(){
        //获取当前线程对象。
        Thread thread = Thread.currentThread();
        //获取当前线程对象的名称
        String name = thread.getName();
        System.out.println(name);
        //获取当前线程的ID
        System.out.println(thread.getId());
        //获取线程的优先级  在一般的范围内时0-10的值，如果没有经设置的话为5.有些系统时0-100；
        int priority = thread.getPriority();
        System.out.println(priority);
        //设置线程池的优先级
        /**
         * 优先级越高，一定越先执行吗？
         *  不一定，只是优先执行的概率比较大而已。
         */
        thread.setPriority(0);
        System.out.println(thread.getPriority());

        ThreadApiDemo threadApiDemo = new ThreadApiDemo();
        Thread thread1 = new Thread(threadApiDemo);
        boolean alive = thread1.isAlive();
        //是否存活
        System.out.println(thread1.isAlive());
        thread1.start();
        System.out.println(thread1.getPriority());
        System.out.println(thread1.isAlive());

        for (int i = 0 ; i< 5; i++){
            System.out.println(Thread.currentThread().getName()+"-----"+i);
        }
        System.out.println(thread1.isAlive());

    }


    @Override
    public void run() {
        for (int i = 0 ; i< 5; i++){
            System.out.println(Thread.currentThread().getName()+"-----"+i);
        }
    }
}
