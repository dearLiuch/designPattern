package com.lch.study.factory.abstractfactory.demo2;

/**
 * 具体产品：生产笔记本 MiPC
 */
public class MiPC implements PC {

    public MiPC(){
        this.makePC();
    }

    @Override
    public void makePC() {
        System.out.println("make MiPC");
    }
}
