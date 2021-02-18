package com.amity.design.fuyong;

/**
 * Created by Amity on 2021/2/3 9:57
 */
public class Car {
    protected Color color;

    public Car(Color color) {
        this.color = color;
    }

    public void move() {
        System.out.println("I‘m a " + color + "car, I can quickly move");
    }
}
