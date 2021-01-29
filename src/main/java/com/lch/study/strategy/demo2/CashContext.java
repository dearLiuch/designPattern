package com.lch.study.strategy.demo2;

public class CashContext {
    CashSuper cs = null;

    public CashContext(CashSuper csuper) {
        this.cs = csuper;
    }

    public double getResult(double money) {

        return cs.acceptCash(money);
    }
}