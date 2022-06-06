package com.example.demo;

abstract public class TextOutputs {
    public static void Name() {
        System.out.println("Taxes calculator");
    }
    public static void UserChoice() {
        System.out.println("""
                Please, input: 
                1 - to calculate taxes for living Space
                2 - to calculate taxes for Trade Space 
                3 - to calculate taxes for Production Space""");
    }
    public static void Lines(){
        System.out.println("_____________________________________________________");
    }
    public static void Error1() {
        System.out.println("Error, you did not enter a corresponding number, try again!");
    }
    public static void RevenueAsk() {
        System.out.println("Please, enter you revenue");
    }
    public static void AreaAsk() {
        System.out.println("Please, enter you area");
    }
    public static void SubsidiaryAsk() {
        System.out.println("Please, enter you subsidiary in % (0-100)");
    }
}