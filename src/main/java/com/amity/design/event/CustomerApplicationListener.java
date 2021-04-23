package com.amity.design.event;

import org.springframework.context.ApplicationListener;

/**
 * Created by Amity on 2021/4/6 下午 3:35
 */
public class CustomerApplicationListener implements ApplicationListener<CustomerApplicationEvent> {

    @Override
    public void onApplicationEvent(CustomerApplicationEvent event) {

    }
}
