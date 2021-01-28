package com.lch.study.factory.simplefactory;

/**
 * 具体产品：小米手机
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
