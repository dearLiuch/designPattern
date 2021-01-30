package com.lch.study.factory.simplefactory;

/**
 * 客户端：通过简单工厂模式创建同一类不同产品
 */
public class Client {
    public static void main(String[] args) {
        Factory factory = new Factory();
        Phone iphone = factory.createPhone("IPhone");

        Phone miPhone = factory.createPhone("MiPhone");

    }
}
