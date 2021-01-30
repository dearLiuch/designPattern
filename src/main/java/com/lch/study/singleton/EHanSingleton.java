package com.lch.study.singleton;

/**
 * 饿汉式
 * 优点：没有线程安全问题 todo 没理解
 * 缺点：提前初始化会延长类加载器加载类的时间；如果不使用会浪费内存空间；
 */
public class EHanSingleton {

    private static final EHanSingleton singleton = new EHanSingleton();

    private EHanSingleton(){

/*        // 为了防止反射获取多个对象的漏洞，在私有构造函数中加非空判断
        if(null != singleton){
            throw new RuntimeException();
        }*/

    }

    public static EHanSingleton getSingleton(){
        return singleton;
    }




}
