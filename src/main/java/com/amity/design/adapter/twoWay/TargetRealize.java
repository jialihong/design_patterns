package com.amity.design.adapter.twoWay;

/**
 * Created by Amity on 2021/2/7 下午 6:15
 * 目标实现
 */
public class TargetRealize implements TwoWayTarget{

    @Override
    public void request() {
        System.out.println("目标代码被调用！");
    }
}
