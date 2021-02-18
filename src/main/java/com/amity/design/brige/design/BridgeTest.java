package com.amity.design.brige.design;

/**
 * Created by Amity on 2021/2/8 上午 11:02
 */
public class BridgeTest {

    public static void main(String[] args) {
        Implementor imple = new ConcreteImplementorA();
        Abstraction abs = new RefinedAbstraction(imple);
        abs.operation();
    }

}
