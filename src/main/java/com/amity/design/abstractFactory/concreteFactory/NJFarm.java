package com.amity.design.abstractFactory.concreteFactory;

import com.amity.design.abstractFactory.abstractClass.Animal;
import com.amity.design.abstractFactory.abstractClass.Plant;
import com.amity.design.abstractFactory.abstractFactory.Farm;
import com.amity.design.abstractFactory.concreteClass.Cattle;
import com.amity.design.abstractFactory.concreteClass.Vegetables;

/**
 * Created by Amity on 2021/2/4 16:48
 * 具体工厂：南京农场类
 */
public class NJFarm implements Farm {

    public Animal newAnimal() {
        System.out.println("新牛出生！");
        return new Cattle();
    }

    public Plant newPlant() {
        System.out.println("蔬菜长成！");
        return new Vegetables();
    }
}
