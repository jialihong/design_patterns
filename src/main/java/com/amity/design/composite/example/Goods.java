package com.amity.design.composite.example;

/**
 * Created by Amity on 2021/2/20 下午 4:25
 * 树叶构件：商品
 */
public class Goods implements Articles{

    /**
     * 名称
     */
    private String name;

    /**
     * 数量
     */
    private Integer quantity;

    /**
     * 单价
     */
    private float unitPrice;

    public Goods(String name, Integer quantity, float unitPrice) {
        this.name = name;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }

    @Override
    public float calculation() {
        return quantity * unitPrice;
    }

    @Override
    public void show() {
        System.out.println(name + "(数量：" + quantity + "，单价：" + unitPrice + "元)");
    }
}
