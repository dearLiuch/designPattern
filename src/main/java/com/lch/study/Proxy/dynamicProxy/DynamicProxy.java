package com.lch.study.Proxy.dynamicProxy;

import org.springframework.cglib.proxy.InvocationHandler;

import java.lang.reflect.Method;

/**
 * 动态代理角色
 */
public class DynamicProxy implements InvocationHandler {

    private Object object;

    public DynamicProxy(Object object){
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method mehtod, Object[] args) throws Throwable {
        // todo 对反射多练习api操作
        Object result = mehtod.invoke(object, args);
        return result;
    }
}
