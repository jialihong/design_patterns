package com.amity.design.brige.design;

/**
 * Created by Amity on 2021/2/8 上午 11:00
 * 扩展抽象化角色
 */
public class RefinedAbstraction extends Abstraction{

    protected RefinedAbstraction(Implementor imple) {
        super(imple);
    }

    @Override
    public void operation() {
        System.out.println("扩展抽象化(Refined Abstraction)角色被访问");
        imple.operationImpl();
    }

}
