package com.lch.study.factory.abstractfactory.demo1;

/**
 * 有两个工厂，每个工厂都可以生产水果和饮料
 */
public class Client {

    public static void main(String[] args) {
        FoodFactory kindOneFoodFactory = new KindOneFoodFactory();
        FoodFactory kindTwoFoodFactory = new KindTwoFoodFactory();

        System.out.println("套餐1：苹果、牛奶");
        // 套餐1：苹果、牛奶
        kindOneFoodFactory.createDrink();
        kindOneFoodFactory.createFruit();

        System.out.println("套餐2：香蕉、饮用水");
        // 套餐2：香蕉、饮用水
        kindTwoFoodFactory.createFruit();
        kindTwoFoodFactory.createDrink();
    }
}
