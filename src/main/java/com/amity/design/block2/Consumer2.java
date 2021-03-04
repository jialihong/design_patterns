package com.amity.design.block2;

/**
 * Created by Amity on 2021/3/4 下午 8:24
 */
public class Consumer2 implements Runnable{

    @Override
    public void run() {
        consumer();
    }

    public void consumer() {
        while (true) {
            try {
                MyBlockingQueue2.queue.take();
                System.out.println("吃掉了一头烤猪。烤猪数量：" + MyBlockingQueue2.queue.size());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
