package com.lch.study.strategy.demo1;

/**
 * 具体策略角色类
 */
public class ConcreteStrategyA implements Strategy {
    @Override
    public void algorithmLogic() {
        System.out.println("use algorithm ATest");
    }
}
