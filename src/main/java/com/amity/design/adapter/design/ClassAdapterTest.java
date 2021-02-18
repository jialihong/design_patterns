package com.amity.design.adapter.design;

/**
 * Created by Amity on 2021/2/7 上午 11:51
 * 类适配器测试--客户端
 */
public class ClassAdapterTest {

    public static void main(String[] args) {
        System.out.println("类适配器模式测试：");
        Target target = new ClassAdapter();
        target.request();
    }

}
