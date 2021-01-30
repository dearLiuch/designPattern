package com.lch.study.strategy.demo2;

/**
 * 使用策略角色：持有策略引用，根据不同策略实现不同业务算法逻辑
 */
public class CashContext {
    CashSuper cs = null;

    /**
     * 通过构造函数传递具体策略
     * @param csuper
     */
    public CashContext(CashSuper csuper) {
        this.cs = csuper;
    }

    public double getResult(double money) {
        return cs.acceptCash(money);
    }
}