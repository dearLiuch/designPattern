package com.lch.study.strategy.demo2;

/**
 * 策略一：正常收费
 */
public class CashNormal implements CashSuper {
 
     @Override
     public double acceptCash(double money) {
 
         return money;
     }
 
 }