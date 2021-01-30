package com.lch.study.factory.abstractfactory.demo2;

/**
 * 具体产品：生产笔记本 MAC
 */
public class MAC implements PC {

    public MAC(){
        this.makePC();
    }

    @Override
    public void makePC() {
        System.out.println("make MAC");
    }
}
