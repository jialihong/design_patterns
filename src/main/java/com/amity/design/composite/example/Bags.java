package com.amity.design.composite.example;

import java.util.ArrayList;

/**
 * Created by Amity on 2021/2/20 下午 4:29
 * 树枝构件：袋子
 */
public class Bags implements Articles{

    /**
     * 名字
     */
    private String name;

    /**
     * 里面装的商品
     */
    private ArrayList<Articles> bags = new ArrayList<>();

    public Bags(String name) {
        this.name = name;
    }

    public void add(Articles c) {
        bags.add(c);
    }
    public void remove(Articles c) {
        bags.remove(c);
    }
    public Articles getChild(int i) {
        return bags.get(i);
    }

    @Override
    public float calculation() {
        float s = 0;
        for (Articles article : bags) {
            s += article.calculation();
        }
        return s;
    }

    @Override
    public void show() {
        for (Articles article : bags) {
            article.show();
        }
    }
}
