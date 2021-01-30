package com.lch.study.factory.abstractfactory.demo2;

/**
 * 抽象工厂角色:支持创建不同类的产品Phone、PC
 */
public interface AbstractFactory {
    Phone makePhone();
    PC makePC();
}
