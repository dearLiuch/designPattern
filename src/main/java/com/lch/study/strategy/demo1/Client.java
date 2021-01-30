package com.lch.study.strategy.demo1;

/**
 * 客户端
 */
public class Client {
    public static void main(String[] args) {
        Context context = new Context(new ConcreteStrategyA());
        context.contextInterface();

        context = new Context(new ConcreteStrategyB());
        context.contextInterface();
    }
}
