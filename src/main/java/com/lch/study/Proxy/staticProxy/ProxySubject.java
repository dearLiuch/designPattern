package com.lch.study.Proxy.staticProxy;

/**
 * 静态代理，对具体真实对象直接引用
 */
public class ProxySubject extends Subject{

    private RealSubject realSubject = null;

    @Override
    public void request() {
        // 真实角色操作前的附加操作
        preRequest();

        // 真实角色不是通过set或者构造方法传参赋值的，而是直接在方法内部new真实对象，在内部代理方法中封装真实对象
        if(realSubject == null){
            realSubject = new RealSubject();
        }
        realSubject.request();

        // 真实角色操作后的附加操作
        postRequest();
    }

    private void preRequest(){
        System.out.println("proxySubject do pre someThing");
    }

    private void postRequest(){
        System.out.println("proxySubject do post something");
    }
}
