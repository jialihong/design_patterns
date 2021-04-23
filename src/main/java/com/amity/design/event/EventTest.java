package com.amity.design.event;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Created by Amity on 2021/4/6 下午 3:46
 */
public class EventTest {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new FileSystemXmlApplicationContext("E:/workspace/design_patterns/src/applicationContext.xml");
        CustomerApplicationEvent customEvent = new CustomerApplicationEvent(applicationContext);
        applicationContext.publishEvent(customEvent);
    }

}
