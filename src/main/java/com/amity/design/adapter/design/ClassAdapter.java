package com.amity.design.adapter.design;

/**
 * Created by Amity on 2021/2/7 上午 11:48
 * 类适配器类
 */
public class ClassAdapter extends Adaptee implements Target {

    public void request() {
        specificRequest();
    }

}
