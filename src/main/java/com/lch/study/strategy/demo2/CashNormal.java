package com.lch.study.strategy.demo2;

public class CashNormal implements CashSuper {
 
     @Override
     public double acceptCash(double money) {
 
         return money;
     }
 
 }