package com.amity.design.block2;

/**
 * Created by Amity on 2021/3/4 下午 8:17
 */
public class Product2 implements Runnable{

    @Override
    public void run() {
        product();
    }

    public void product() {
        while (true) {
            try {
                MyBlockingQueue2.queue.put(1);
                System.out.println("生产了一头烤猪。烤猪数量：" + MyBlockingQueue2.queue.size());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
