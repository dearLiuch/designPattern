package com.lch.study.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 单例模式是可以通过反射方式被破坏的，因为通过反射方式可以直接调用私有构造器
 *
 */
public class ReflectSingleton {

    public static void main(String[] args) {
        try {
            Class<EHanSingleton> clazz = (Class<EHanSingleton>)Class.forName("com.lch.study.singleton.EHanSingleton");
            try {
                // 通过反射方式可以直接调用私有构造器
                Constructor<EHanSingleton> constructor = clazz.getDeclaredConstructor(null);
                // 跳过权限检查
                constructor.setAccessible(true);
                try {
                    EHanSingleton singleton1 = constructor.newInstance();
                    EHanSingleton singleton2 = constructor.newInstance();
                    System.out.println("通过反射获取的对象singleton1和singleton2是否为同一个对象");
                    // false 如何防止反射获取多个对象的漏洞？
                    System.out.println(singleton1 == singleton2);
                } catch (InstantiationException e) {
                    e.printStackTrace();
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (InvocationTargetException e) {
                    e.printStackTrace();
                }
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
