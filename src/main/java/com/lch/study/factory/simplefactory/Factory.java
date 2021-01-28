package com.lch.study.factory.simplefactory;

/**
 * 简单工厂：根据判断逻辑生成产品
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
