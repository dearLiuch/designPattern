package com.lch.study.factory.abstractfactory.demo2;

/**
 * 具体工厂：负责创建具体不同类产品IPhone、MAC
 */
public class AppleFactory implements AbstractFactory {
    @Override
    public Phone makePhone() {
        return new IPhone();
    }

    @Override
    public PC makePC() {
        return new MAC();
    }
}
