package com.lch.study.strategy.demo1;

/**
 * Context持有strategy的引用，并且提供了调用策略的方法
 */
public class Context {

    Strategy strategy;

    public Context(Strategy strategy){
     this.strategy = strategy;
    }

    public void contextInterface(){
        strategy.algorithmLogic();
    }
}
