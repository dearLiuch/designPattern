package com.lch.study.factory.simplefactory;

/**
 * 具体产品：IPhone
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
