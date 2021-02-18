package com.amity.design.adapter.example.electric;

import com.amity.design.adapter.example.Motor;

/**
 * Created by Amity on 2021/2/7 下午 4:49
 * 电能适配器
 */
public class ElectricAdapter implements Motor {

    private ElectricMotor emotor;

    public ElectricAdapter() {
        emotor=new ElectricMotor();
    }

    @Override
    public void drive() {
        emotor.electricDrive();
    }
}
