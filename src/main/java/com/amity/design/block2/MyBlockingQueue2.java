package com.amity.design.block2;

import java.util.concurrent.ArrayBlockingQueue;

/**
 * Created by Amity on 2021/3/4 下午 8:16
 * 使用阻塞队列ArrayBlockingQueue实现生产者消费者问题
 */
public class MyBlockingQueue2 {
    public final static int queueSize = 10;
    public static ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<>(queueSize);

    public static void main(String[] args) {
        Product2 p = new Product2();
        Consumer2 c = new Consumer2();

        Thread t1 = new Thread(p);
        Thread t2 = new Thread(c);
        t1.start();
        t2.start();
    }


}
