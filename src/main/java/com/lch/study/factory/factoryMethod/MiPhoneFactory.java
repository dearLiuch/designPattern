package com.lch.study.factory.factoryMethod;

/**
 * 具体工厂：小米手机
 */
public class MiPhoneFactory implements Factory {
    @Override
    public Phone createPhone() {
        return new MiPhone();
    }
}
