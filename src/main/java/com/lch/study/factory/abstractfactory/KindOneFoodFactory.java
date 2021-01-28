package com.lch.study.factory.abstractfactory;

/**
 * 具体工厂类：套餐一：苹果、牛奶
 */
public class KindOneFoodFactory implements FoodFactory{

    @Override
    public Fruit createFruit() {
        return new Apple();
    }

    @Override
    public Drink createDrink() {
        return new Milk();
    }
}
