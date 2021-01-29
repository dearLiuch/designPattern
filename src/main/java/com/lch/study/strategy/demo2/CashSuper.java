package com.lch.study.strategy.demo2;

public interface CashSuper {
     /**
      * 计算实收的费用
      * @param money 应收金额
      * @return 实收金额
      */
     double acceptCash(double money);

 }