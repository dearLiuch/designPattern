package com.lch.study.factory.factoryMethod;

/**
 * 具体工厂角色：创建具体产品对应的具体工厂；
 */
public class MiPhoneFactory implements Factory {
    @Override
    public Phone createPhone() {
        return new MiPhone();
    }
}
