package com.lch.study.strategy.demo1;

/**
 * 使用策略角色：
 * Context持有strategy的引用，并且提供了调用策略的方法
 */
public class Context {

    Strategy strategy;

    /**
     * 策略一般都通过构造函数传递
     * @param strategy
     */
    public Context(Strategy strategy){
     this.strategy = strategy;
    }

    public void contextInterface(){
        strategy.algorithmLogic();
    }
}
