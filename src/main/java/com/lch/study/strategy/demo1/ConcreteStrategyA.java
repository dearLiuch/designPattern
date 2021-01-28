package com.lch.study.strategy.demo1;

public class ConcreteStrategyA implements Strategy {
    @Override
    public void algorithmLogic() {
        System.out.println("use algorithm A");
    }
}
