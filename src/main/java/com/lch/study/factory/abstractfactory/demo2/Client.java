package com.lch.study.factory.abstractfactory.demo2;

/**
 * 客户端：根据不同工厂创建不同类的具体产品
 */
public class Client {
    public static void main(String[] args) {
        AbstractFactory miFactory = new XiaoMiFactory();
        AbstractFactory appleFactory = new AppleFactory();

        System.out.println("this is miFactory:");
        miFactory.makePC();
        miFactory.makePhone();

        System.out.println("this is appleFactory:");
        appleFactory.makePhone();
        appleFactory.makePC();
    }
}
