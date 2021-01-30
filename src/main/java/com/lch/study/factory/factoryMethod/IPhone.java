package com.lch.study.factory.factoryMethod;

/**
 * 具体产品角色：具体工厂对应创建的具体产品；
 */
public class IPhone implements Phone {

    public IPhone(){
        this.make();
    }

    @Override
    public void make() {
        System.out.println("make IPhone");
    }
}
