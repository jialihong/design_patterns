package com.amity.design.zhexuejiaDinner;

/**
 * Created by Amity on 2021/3/4 下午 8:50
 */
public class DinnerTest {

    public static void main(String[] args) {
        Fork fork = new Fork();
        new Philosopher("0",fork).start();
        new Philosopher("1",fork).start();
        new Philosopher("2",fork).start();
        new Philosopher("3",fork).start();
        new Philosopher("4",fork).start();
    }
}
