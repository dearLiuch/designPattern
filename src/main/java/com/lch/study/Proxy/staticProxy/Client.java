package com.lch.study.Proxy.staticProxy;

/**
 * 客户端的调用
 */
public class Client {
    public static void main(String[] args) {
        Subject proxySubject = new ProxySubject();
        // 代理者代替真实角色做事情
        proxySubject.request();
    }
}
