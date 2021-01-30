package com.lch.study.factory.simplefactory;

/**
 * 具体产品类，工厂所创建的对象就是此⻆⾊的实例
 */
public class MiPhone implements Phone {
    public MiPhone(){
        this.make();
    }

    @Override
    public void make() {
        System.out.println("make MiPhone");
    }
}
