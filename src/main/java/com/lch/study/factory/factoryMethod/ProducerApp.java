package com.lch.study.factory.factoryMethod;

/**
 * 工厂方法模式：
 * 工厂（抽象、具体），产品（抽象、具体），仅生成同一类产品
 * 如果需要新增产品，只需要新增一个产品子类和产品对应的工厂类即可，不需要修改之前的业务逻辑，仅仅是在客户端新增
 * 工厂方法调用即可；
 *
 * 如果是多种产品，需要使用抽象工厂模式
 */
public class ProducerApp {
    public static void main(String[] args) {
        Factory miPhoneFactory = new MiPhoneFactory();
        miPhoneFactory.createPhone();

        Factory iphoneFactory = new IPhoneFactory();
        iphoneFactory.createPhone();

    }
}
