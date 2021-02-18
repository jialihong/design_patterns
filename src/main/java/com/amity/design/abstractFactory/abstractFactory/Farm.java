package com.amity.design.abstractFactory.abstractFactory;

import com.amity.design.abstractFactory.abstractClass.Animal;
import com.amity.design.abstractFactory.abstractClass.Plant;

/**
 * Created by Amity on 2021/2/4 16:46
 * 抽象工厂：农场类
 */
public interface Farm {

    Animal newAnimal();

    Plant newPlant();
}
