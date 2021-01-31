package com.lch.study.Proxy.dynamicProxy;

import org.springframework.cglib.proxy.Proxy;

/**
 * 客户端
 */
public class Client {

    public static void main(String[] args) {
        RealSubject realSubject = new RealSubject();
        DynamicProxy dynamicProxy = new DynamicProxy(realSubject);
        ClassLoader classLoader = realSubject.getClass().getClassLoader();
        //todo 多熟练 Proxy.newProxyInstance(ClassLoader loader,Class<?>[] interfaces, InvocationHandler handler)方法
        Subject subject = (Subject)Proxy.newProxyInstance(classLoader, new Class[]{Subject.class}, dynamicProxy);
        subject.request();
    }
}
