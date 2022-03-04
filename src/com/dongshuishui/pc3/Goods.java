package com.dongshuishui.pc3;

public class Goods {
    private String brand;
    private String name;
    //默认不存在商品的，如果为true代表有商品
    private  boolean flag = false;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //消费者获取商品
    public synchronized void get(){
//如果flag为fals时，意味生产者没有生产商品，此时消费者无法消费，需要让消费者进行阻塞状态，等的生产者生产，当有了商品之后，
// 消费者开始消费
        if(!flag){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("消费者拿走了"+this.getBrand()+"---"+this.getName());
        flag = false;
        //唤醒生产者生产商品
        notify();
    }
    //生产者生产商品
    public synchronized void set(String brand ,String name){
        //当生产者抢占到cpu资源会判断当前对象是否优质，如果有的话，以为消费者还没有消费，需要提醒消费者消费，同时当前
        //线程进行阻塞状态，等待消费取走商品之后，再次生产，如果没有商品的话，不需要等待，阻塞状态，直接生产即可。
        if(flag ==true){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.setBrand(brand);
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.setName(name);
        System.out.println("生产者生产了"+this.getBrand()+"---"+this.getName());
        //代表生产了商品。
        flag = true;
//唤醒消费者消费商品
        notify();
    }
}
