package com.dongshuishui.pc;

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
                goods.setBrand("哇哈哈");
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                goods.setName("矿泉水");
                System.out.println("生产者生产了"+this.goods.getBrand() + "---"+this.goods.getName());
            }else {
                goods.setBrand("旺仔");
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                goods.setName("小馒头");
                System.out.println("生产者生产了"+this.goods.getBrand() + "---"+this.goods.getName());

            }
        }
    }
}
