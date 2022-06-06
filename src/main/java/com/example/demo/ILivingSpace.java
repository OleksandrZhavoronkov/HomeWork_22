package com.example.demo;

public interface ILivingSpace {
    final static String name = "Living Space";
    static int taxK = 50;
    default float ILivingSpaceTaxCalculation() {
        return 0;
    }
}