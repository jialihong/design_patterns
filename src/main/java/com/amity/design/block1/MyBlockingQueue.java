package com.amity.design.block1;

import java.util.PriorityQueue;

/**
 * Created by Amity on 2021/3/4 下午 7:28
 * 阻塞队列 实现方式一 ： 使用非阻塞队列PriorityQueue以及notify(),wait()机制实现一个阻塞队列
 */
public class MyBlockingQueue {
    public final static int queueSize = 10;

    public static PriorityQueue<Integer> queue = new PriorityQueue<>();

    public static void main(String[] args) {
        Product p = new Product();
        Consumer c = new Consumer();

        Thread t1 = new Thread(p);
        Thread t2 = new Thread(c);
        t1.start();
        t2.start();
    }

}
