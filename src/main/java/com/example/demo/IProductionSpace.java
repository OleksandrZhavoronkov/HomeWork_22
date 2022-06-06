package com.example.demo;

public interface IProductionSpace {
    final static String name = "Production Space";
    static int taxK = 50;
    default float IProductionSpaceTaxCalculation(){
        return 0;
    }
}