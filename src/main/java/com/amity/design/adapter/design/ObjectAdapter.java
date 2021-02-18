package com.amity.design.adapter.design;

/**
 * Created by Amity on 2021/2/7 下午 12:04
 * 对象适配器
 */
public class ObjectAdapter implements Target {

    private Adaptee adaptee;

    public ObjectAdapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
        adaptee.specificRequest();
    }
}
