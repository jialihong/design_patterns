package com.amity.design.event;

import org.springframework.context.ApplicationEvent;

/**
 * Created by Amity on 2021/4/6 下午 3:12
 * 自定义事件
 */
public class CustomerApplicationEvent extends ApplicationEvent {
    /**
     * Create a new {@code ApplicationEvent}.
     *
     * @param source the object on which the event initially occurred or with
     *               which the event is associated (never {@code null})
     */
    public CustomerApplicationEvent(Object source) {
        super(source);
        System.out.println("Created a Custom event");
    }
}
