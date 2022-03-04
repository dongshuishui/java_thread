package com.dongshuishui.proxy;

public class XiMenQing {
    public static void main(String[] args) {
        WangPo wangPo = new WangPo(new PanJinLian());
        wangPo.playWithMen();
        wangPo.makeEyesWithMen();

        JiaShi jiaShi = new JiaShi();
        WangPo wangPo1 = new WangPo(jiaShi);
        wangPo1.makeEyesWithMen();
        wangPo1.playWithMen();
    }
}
