package com.lch.study.factory.abstractfactory;

/**
 * 具体工厂类：套餐一：香蕉、饮用水
 */
public class KindTwoFoodFactory implements FoodFactory{
    @Override
    public Fruit createFruit() {
        return new Banala();
    }

    @Override
    public Drink createDrink() {
        return new Water();
    }
}
