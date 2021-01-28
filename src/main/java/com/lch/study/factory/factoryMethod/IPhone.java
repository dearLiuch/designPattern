package com.lch.study.factory.factoryMethod;

public class IPhone implements Phone {

    public IPhone(){
        this.make();
    }

    @Override
    public void make() {
        System.out.println("make IPhone");
    }
}
