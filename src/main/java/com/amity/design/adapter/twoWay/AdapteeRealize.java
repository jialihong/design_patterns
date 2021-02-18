package com.amity.design.adapter.twoWay;

/**
 * Created by Amity on 2021/2/7 下午 6:15
 * 适配者实现
 */
public class AdapteeRealize implements TwoWayAdaptee{

    @Override
    public void specificRequest() {
        System.out.println("适配者代码被调用！");
    }

}
