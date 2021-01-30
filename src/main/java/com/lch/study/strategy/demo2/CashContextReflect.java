package com.lch.study.strategy.demo2;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 通过反射来创建具体策略对象，并且调用策略方法
 */
public class CashContextReflect {
     Class<?> clazz = null;
     // 通过反射创建具体策略对象，如CashRebate
     Object obj = null;

     public CashContextReflect(String className, Class[] paramsType, Object[] parmas){
         try {
             // Class.forName(className)，要求JVM查找并加载指定的类，JVM会执行该类的静态代码段。
             clazz = Class.forName(className);
             // 获取一个有参数的公有Constructor对象，paramsType为创建对象的有参构造函数的参数类型
             Constructor con = clazz.getConstructor(paramsType);
             // 传递实参构造对象实例
             obj = con.newInstance(parmas);
         } catch (InstantiationException | IllegalAccessException e) {
             e.printStackTrace();
         } catch (ClassNotFoundException e) {
             e.printStackTrace();
         } catch (IllegalArgumentException e) {
             e.printStackTrace();
         } catch (InvocationTargetException e) {
             e.printStackTrace();
         } catch (NoSuchMethodException e) {
             e.printStackTrace();
         } catch (SecurityException e) {
             e.printStackTrace();
         }
         
     }
     
     public double getResult(double money){
         // 调用策略具体方法（策略对象是通过反射创建出来的）
         return ((CashSuper)obj).acceptCash(money);
     }
 }