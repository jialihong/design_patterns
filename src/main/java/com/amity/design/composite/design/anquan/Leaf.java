package com.amity.design.composite.design.anquan;

/**
 * Created by Amity on 2021/2/20 下午 12:21
 */
public class Leaf implements Component {

    private String name;

    public Leaf(String name) {
        this.name = name;
    }

    @Override
    public void operation() {
        System.out.println("安全组合-- 树叶" + name + "：被访问！");
    }
}
