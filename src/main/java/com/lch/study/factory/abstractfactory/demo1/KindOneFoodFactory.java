package com.lch.study.factory.abstractfactory.demo1;

/**
 *
 * 具体工厂角色：具体工厂支持创建多个不同类具体产品
 * 如：
 * 套餐一：苹果、牛奶
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
