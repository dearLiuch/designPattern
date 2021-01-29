package com.lch.study.strategy.demo2;
public class CashFactory {
    public static CashSuper createCashAccept(String cashType){
        /**
         * 试想下，如果这里不用工厂结合策略模式，那么有一堆策略业务逻辑代码，代码很长且可读性不好
         */
        CashSuper cs = null;
        switch (cashType) {
            case "正常收费" :
                cs = new CashNormal();
                break;
            case "打8折" :
                cs = new CashRebate(8);
                break;
            case "满300减100" :
                cs = new CashReturn(300, 100);
                break;
            default :
                break;
        }

        return cs;
    }
}