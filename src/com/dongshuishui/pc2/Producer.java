package com.dongshuishui.pc2;

/**
 * 生产者时为了生产产品，将产品放入共享空间的
 */
public class Producer implements  Runnable {

    private Goods goods;
    public Producer(Goods goods){
        this.goods = goods;
    }
    @Override
    public void run() {
        for(int i = 0; i< 10 ;i++){
            if(i%2 == 0){
                goods.set("哇哈哈","矿泉水");
            }else {
                goods.set("旺仔","小馒头");
            }
        }
    }
}
