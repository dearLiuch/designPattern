package com.lch.study.Proxy.dynamicProxy;

/**
 * 真实角色
 */
public class RealSubject extends Subject{

    @Override
    public void request() {
        System.out.println("realSubject do someThing");
    }
}
