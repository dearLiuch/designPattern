package com.lch.study.factory.abstractfactory.demo1;

/**
 * 制造早餐的工厂，可生产水果、饮料
 */
interface FoodFactory {
    // 制造水果
    Fruit createFruit();

    // 制造饮料
    Drink createDrink();
}
