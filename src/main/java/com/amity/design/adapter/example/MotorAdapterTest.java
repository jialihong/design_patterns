package com.amity.design.adapter.example;

import com.amity.design.util.ReadXML;

/**
 * Created by Amity on 2021/2/7 下午 5:00
 */
public class MotorAdapterTest {

    public static void main(String[] args) {
        System.out.println("适配器模式测试：");
        Motor motor=(Motor) ReadXML.getObject();
        motor.drive();
    }
}
