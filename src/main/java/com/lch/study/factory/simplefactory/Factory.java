package com.lch.study.factory.simplefactory;

/**
 * ⼯⼚类，简单工厂模式的核⼼，含有⼀定的商业逻辑和判断逻辑，⽤来创建产品
 */
public class Factory {
    public Phone createPhone(String phoneType){
        if(phoneType.equals("MiPhone")){
            return new MiPhone();
        }else if(phoneType.equals("IPhone")){
            return new IPhone();
        }
        return null;
    }
}
