package com.amity.design.zhexuejiaDinner;

/**
 * Created by Amity on 2021/3/4 下午 8:47
 * 每个哲学家相当于一个线程
 */
public class Philosopher extends Thread{

    private String name;
    private Fork fork;
    public Philosopher(String name,Fork fork){
        super(name);
        this.name=name;
        this.fork=fork;
    }

    public void run(){
        while(true){
            thinking();
            fork.takeFork();
            eating();
            fork.putFork();
        }

    }

    public void eating(){
        System.out.println("I am Eating:"+name);
        try {
            sleep(1000);//模拟吃饭，占用一段时间资源
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }


    public void thinking(){
        System.out.println("I am Thinking:"+name);
        try {
            sleep(1000);//模拟思考
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
