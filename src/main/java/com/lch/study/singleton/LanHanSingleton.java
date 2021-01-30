package com.lch.study.singleton;

/**
 * 懒汉式：
 * 优点：
 * 1.解决线程安全；todo 不理解线程安全
 * 2.延迟初始化
 */
public class LanHanSingleton {

    private LanHanSingleton(){

    }

    public static LanHanSingleton getInstance(){
        return Holder.singleton;
    }

    // todo 内部类Holder的加载顺序？是只有在类中的内部类被调用时，才会初始化操作吗？
    private static class Holder{
        private static final LanHanSingleton singleton = new LanHanSingleton();

    }
}
