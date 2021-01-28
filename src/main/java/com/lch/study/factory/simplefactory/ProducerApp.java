package com.lch.study.factory.simplefactory;

/**
 * 简单工厂模式：
 * 产品（抽象、具体）、工厂（根据判断逻辑生成不同产品）
 * 缺点：如果新增一种产品，需要修改工厂内部方法，添加if判断，改动了原来的代码
 * 由此，引出 工厂方法模式
 */
public class ProducerApp {
    public static void main(String[] args) {
        Factory factory = new Factory();
        Phone iphone = factory.createPhone("IPhone");

        Phone miPhone = factory.createPhone("MiPhone");

    }
}
