package com.lch.study.factory.abstractfactory.demo2;

/**
 * 具体产品：生产手机IPhone
 */
public class IPhone implements Phone {

    public IPhone(){
        this.makePhone();
    }

    @Override
    public void makePhone() {
        System.out.println("make IPhone");
    }
}
