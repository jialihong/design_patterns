package com.amity.design.block1;

/**
 * Created by Amity on 2021/3/4 下午 7:43
 * 生产者
 */
public class Product implements Runnable{

    @Override
    public void run() {
        product();
    }

    public void product() {
        while (true) {
            synchronized (MyBlockingQueue.queue) {
                while (MyBlockingQueue.queueSize == MyBlockingQueue.queue.size()) {
                    try {
                        System.out.println("仓库已经放不下烤猪了，赶快来吃吧。烤猪数量：" + MyBlockingQueue.queueSize);
                        MyBlockingQueue.queue.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                        notify();
                    }
                }
                MyBlockingQueue.queue.offer(1);
                System.out.println("我烤了一头猪。烤猪数量：" + MyBlockingQueue.queue.size());
                MyBlockingQueue.queue.notify();
                System.out.println();
            }
        }
    }
}
