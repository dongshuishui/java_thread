package com.dongshuishui.pc2;

/**
 *  从共享空间里区出产品
 */
public class Consumer implements  Runnable {
    private Goods goods;
    public Consumer(Goods goods){
        this.goods = goods;
    }
    @Override
    public void run() {
        for(int i = 0 ; i< 10 ;i++){
           goods.get();
        }
    }
}
