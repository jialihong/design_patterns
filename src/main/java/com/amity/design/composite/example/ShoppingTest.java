package com.amity.design.composite.example;

/**
 * Created by Amity on 2021/2/20 下午 4:34
 */
public class ShoppingTest {

    public static void main(String[] args) {

        Bags smallRedBag = new Bags("红色小袋子");
        Goods goods1 = new Goods("婺源特产", 2, 7.9f);
        smallRedBag.add(goods1);
        Goods goods2 = new Goods("婺源地图", 1, 9.9f);
        smallRedBag.add(goods2);

        Bags smallWhiteBag = new Bags("白色小袋子");
        Goods goods3 = new Goods("韶关香菇", 2, 68);
        smallWhiteBag.add(goods3);
        Goods goods4 = new Goods("韶关红茶", 3, 180);
        smallWhiteBag.add(goods4);


        Bags mediumBag = new Bags("中袋子");
        Goods goods5 = new Goods("景德镇瓷器", 1, 380);
        mediumBag.add(goods5);
        mediumBag.add(smallRedBag);

        Bags bigBag = new Bags("大袋子");
        Goods goods6 = new Goods("李宁牌运动鞋", 1, 198);
        bigBag.add(goods6);
        bigBag.add(smallWhiteBag);
        bigBag.add(mediumBag);

        System.out.println("您选购的商品有：");
        bigBag.show();

        System.out.println("要支付的总价是：" + bigBag.calculation() + "元");

    }
}
