package com.lch.study.singleton;

/**
 * 双重检查锁实现单例模式：
 * 对singleton两次非空检查，中间对其进行一次加锁
 */
public class DoubleCheckSingleton {

    // todo 为什么这里不需要加上final？
    // todo volatile可见性的理解？
    private volatile static DoubleCheckSingleton uniqueSingleton;

    private DoubleCheckSingleton(){

    }

    public static DoubleCheckSingleton getInstance(){
        // todo 理解双重锁设计的思想，为什么两次非空校验，为什么加锁？
        // 加锁不是原子操作，加锁的对象可能已经被初始化掉了，
        // 所以在加锁完毕后，还需要再去判断一次它是否为空，如果为空，再去创建

        if(null == uniqueSingleton){
            synchronized (DoubleCheckSingleton.class){
                if(null == uniqueSingleton){
                    uniqueSingleton = new DoubleCheckSingleton();
                }
            }
        }
        return uniqueSingleton;
    }

}
