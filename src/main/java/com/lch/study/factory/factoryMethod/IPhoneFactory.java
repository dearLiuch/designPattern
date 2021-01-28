package com.lch.study.factory.factoryMethod;

/**
 * 具体工厂：IPhone
 */
public class IPhoneFactory implements Factory {
    @Override
    public Phone createPhone() {
        return new IPhone();
    }
}
