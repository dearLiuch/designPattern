package com.lch.study;

public class CashContext {
    CashSuper cs = null;

    public CashContext(CashSuper csuper) {
        this.cs = csuper;
    }

    public double getResult(double money) {

        return cs.acceptCash(money);
    }
}