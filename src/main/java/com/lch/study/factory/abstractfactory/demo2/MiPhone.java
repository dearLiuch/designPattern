package com.lch.study.factory.abstractfactory.demo2;

/**
 * 具体产品：生产手机MiPhone
 */
public class MiPhone implements Phone {

    public MiPhone(){
        this.makePhone();
    }

    @Override
    public void makePhone() {
        System.out.println("make MiPhone");
    }
}
