package com.amity.design.flyweight.design;

import java.util.HashMap;

/**
 * Created by Amity on 2021/2/19 下午 4:29
 * 享元工厂角色
 */
public class FlyweightFactory {

    private HashMap<String, Flyweight> flyweights = new HashMap<String, Flyweight>();

    public Flyweight getFlyweight(String key) {
        Flyweight flyweight = flyweights.get(key);
        if (flyweight != null) {
            System.out.println("具体享元" + key + "已经存在，被成功获取！");
        } else {
            flyweight = new ConcreteFlyweight(key);
            flyweights.put(key, flyweight);
        }
        return flyweight;
    }

}
