package com.lch.study.factory.factoryMethod;

/**
 * 通过具体工厂创建具体产品
 */
public class Client {
    public static void main(String[] args) {
        Factory miPhoneFactory = new MiPhoneFactory();
        miPhoneFactory.createPhone();

        Factory iphoneFactory = new IPhoneFactory();
        iphoneFactory.createPhone();

    }
}
