package com.amity.design.flyweight.design;

/**
 * Created by Amity on 2021/2/19 下午 4:29
 * 非享元角色
 */
public class UnsharedConcreteFlyweight {

    private String info;

    public UnsharedConcreteFlyweight(String info) {
        this.info = info;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
