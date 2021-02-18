package com.amity.design.brige.design;

/**
 * Created by Amity on 2021/2/8 上午 10:51
 * 具体实现化角色
 */
public class ConcreteImplementorA implements Implementor{

    @Override
    public void operationImpl() {
        System.out.println("具体实现化(Concrete Implementor)角色被访问");
    }
}
