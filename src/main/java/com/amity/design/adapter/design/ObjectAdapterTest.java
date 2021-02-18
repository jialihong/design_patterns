package com.amity.design.adapter.design;

import com.amity.design.adapter.design.Adaptee;
import com.amity.design.adapter.design.ObjectAdapter;

/**
 * Created by Amity on 2021/2/7 下午 12:06
 * 对象适配器测试--客户端
 */
public class ObjectAdapterTest {

    public static void main(String[] args) {
        System.out.println("对象适配器模式测试：");
        Adaptee adaptee = new Adaptee();
        ObjectAdapter objectAdapter = new ObjectAdapter(adaptee);
        objectAdapter.request();
    }
}
