package com.lch.study.strategy.demo2;

/**
 * 策略使用角色：持有策略引用，并且调用策略方法
 */
public class CashContextStrategy {
     CashSuper cs = null;
     public CashContextStrategy(String type){
         switch (type) {
             case "正常收费" :
                 CashNormal normal = new CashNormal();
                 cs = normal;
                 break;
             case "满300减100" :
                 CashReturn returnx = new CashReturn(300, 100);
                 cs = returnx;
             case "打8折" :
                 CashRebate rebate = new CashRebate(8);
                 cs = rebate;
             default :
                 break;
         }
     }

    /**
     * 调用策略
     * @param money
     * @return
     */
     public double getResult(double money){
         
         return cs.acceptCash(money);
     }
 }