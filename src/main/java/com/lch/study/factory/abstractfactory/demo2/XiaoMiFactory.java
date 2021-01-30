package com.lch.study.factory.abstractfactory.demo2;

/**
 * 具体工厂：负责创建具体不同类产品MiPhone、MiPC
 */
public class XiaoMiFactory implements AbstractFactory {
    @Override
    public Phone makePhone() {
        return new MiPhone();
    }

    @Override
    public PC makePC() {
        return new MiPC();
    }
}
