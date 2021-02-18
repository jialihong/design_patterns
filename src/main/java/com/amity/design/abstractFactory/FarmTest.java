package com.amity.design.abstractFactory;

import com.amity.design.abstractFactory.abstractClass.Animal;
import com.amity.design.abstractFactory.abstractClass.Plant;
import com.amity.design.abstractFactory.abstractFactory.Farm;
import com.amity.design.util.ReadXML;

/**
 * Created by Amity on 2021/2/4 16:58
 */
public class FarmTest {
    public static void main(String[] args) {
        try {
            Farm f;
            Animal a;
            Plant p;
            f = (Farm) ReadXML.getObject();
            a = f.newAnimal();
            p = f.newPlant();
            a.show();
            p.show();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
