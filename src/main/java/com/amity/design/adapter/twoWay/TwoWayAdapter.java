package com.amity.design.adapter.twoWay;

/**
 * Created by Amity on 2021/2/7 下午 6:16
 * 双向适配器
 */
public class TwoWayAdapter implements TwoWayTarget, TwoWayAdaptee{

    private TwoWayTarget target;
    private TwoWayAdaptee adaptee;

    public TwoWayAdapter(TwoWayTarget target) {
        this.target = target;
    }

    public TwoWayAdapter(TwoWayAdaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void specificRequest() {
        adaptee.specificRequest();
    }

    @Override
    public void request() {
        target.request();
    }
}
