package com.lch.study.factory.abstractfactory;

/**
 * 抽象工厂类：制造早餐，包含水果和饮料
 */
interface FoodFactory {
    // 制造水果
    Fruit createFruit();

    // 制造饮料
    Drink createDrink();
}
