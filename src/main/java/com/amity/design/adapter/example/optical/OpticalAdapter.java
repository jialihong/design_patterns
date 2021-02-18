package com.amity.design.adapter.example.optical;

import com.amity.design.adapter.example.Motor;

/**
 * Created by Amity on 2021/2/7 下午 5:28
 */
public class OpticalAdapter implements Motor {

    private OpticalMotor omotor;

    public OpticalAdapter(){
        omotor=new OpticalMotor();
    }

    @Override
    public void drive() {
        omotor.opticalDrive();
    }

}
