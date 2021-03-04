package com.amity.design.block1;

/**
 * Created by Amity on 2021/3/4 下午 7:44
 * 消费者
 */
public class Consumer implements Runnable{

    @Override
    public void run() {
        consumer();
    }

    public void consumer() {
        while (true) {
            synchronized (MyBlockingQueue.queue) {
                while (MyBlockingQueue.queue.size() == 0) {
                    try {
                        System.out.println("没有烤猪了，赶快生产一个。烤猪数量：" + MyBlockingQueue.queue.size());
                        MyBlockingQueue.queue.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                        notify();
                    }
                }
                MyBlockingQueue.queue.poll();
                System.out.println("吃掉了一头烤猪。烤猪数量：" + MyBlockingQueue.queue.size());
                MyBlockingQueue.queue.notify();
            }
        }
    }
}
