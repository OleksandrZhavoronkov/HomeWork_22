package com.example.demo;

public interface ITradeSpace {
    final static String name = "Trade Space";
    static int taxK = 50;
    default float ITradeSpaceTaxCalculation(){
        return 0;
    }
}