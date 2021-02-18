package com.amity.design.abstractFactory.concreteFactory;

import com.amity.design.abstractFactory.abstractClass.Animal;
import com.amity.design.abstractFactory.abstractClass.Plant;
import com.amity.design.abstractFactory.abstractFactory.Farm;
import com.amity.design.abstractFactory.concreteClass.Fruitage;
import com.amity.design.abstractFactory.concreteClass.Horse;

/**
 * Created by Amity on 2021/2/4 16:49
 * 具体工厂：镇江农场类
 */
public class ZJFarm implements Farm {

    public Animal newAnimal() {
        System.out.println("新马出生！");
        return new Horse();
    }

    public Plant newPlant() {
        System.out.println("水果长成！");
        return new Fruitage();
    }
}
