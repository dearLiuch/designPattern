package com.lch.study.factory.abstractfactory;

/**
 * 抽象工厂模式：抽象工厂、具体工厂、抽象产品A、具体产品A1、抽象产品B，具体产品B1
 * 用于生产多种不同类型的产品，在抽象工厂中，可以生产不同产品；具体工厂中，也能生产具体的产品A和产品B
 *
 */
public class ProducerApp {

    public static void main(String[] args) {
        FoodFactory kindOneFoodFactory = new KindOneFoodFactory();
        FoodFactory kindTwoFoodFactory = new KindTwoFoodFactory();

        // 套餐1：苹果、牛奶
        kindOneFoodFactory.createDrink();
        kindOneFoodFactory.createFruit();

        // 套餐2：香蕉、饮用水
        kindTwoFoodFactory.createFruit();
        kindTwoFoodFactory.createDrink();
    }
}
