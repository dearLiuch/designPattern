package com.lch.study.factory.abstractfactory.demo1;

/**
 *
 * 具体工厂角色：具体工厂支持创建多个不同类具体产品
 * 如：
 * 套餐二：香蕉、饮用水
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
