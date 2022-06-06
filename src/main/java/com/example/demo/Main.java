package com.example.demo;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main extends TextOutputs implements ILivingSpace, ITradeSpace, IProductionSpace{

    String SName;
    float Sx;
    static int revenue;
    static float area;
    static float subsidiary;

    public Main(String Name, float s) {
        this.SName = Name;
        Sx = s;
    }

    @Override
    public String toString() {
        return "Main{" +
                "SName='" + SName + '\'' +
                ", S=" + Sx +
                '}';
    }

    static BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        int userInput;

        Name();//Used from TextOutputs
        //to check whether user`s input in range 1-3
        do {
            Lines();//Used from TextOutputs
            UserChoice();//Used from TextOutputs
            Lines();//Used from TextOutputs
            //User inputs 1-3 to choose what space should be calculated
            userInput = Integer.parseInt(READER.readLine());
            //Choose what user would like to calculate
            if (userInput == 1){
                // to check whether area is not negative or 0
                do {
                    AreaAsk();//Used from TextOutputs
                    Lines();//Used from TextOutputs
                    //User inputs area
                    area = Integer.parseInt(READER.readLine());
                    //check if area below 0
                    if (area <= 0) {
                        Error1();//Used from TextOutputs
                        // Lines();
                    } else {
                        break;
                    }
                } while (area != 1548679582);
                // to check whether subsidiary is not negative
                do {
                    SubsidiaryAsk();//Used from TextOutputs
                    Lines();//Used from TextOutputs
                    //User inputs subsidiary
                    subsidiary = Float.parseFloat(READER.readLine());
                    //check if subsidiary below 0
                    if (subsidiary < 0) {
                       Error1();//Used from TextOutputs
                       // Lines();
                    } else {
                        //object creation and method calling
                        Main Living = new Main(ILivingSpace.name, area);
                        Living.ILivingSpaceTaxCalculation();
                        break;
                    }
                } while (subsidiary != 1548679582);
                break;
            } else if (userInput == 2) {
                RevenueAsk();//Used from TextOutputs
                Lines();//Used from TextOutputs
                //User inputs revenue
                revenue = Integer.parseInt(READER.readLine());
                // to check whether area is not negative or 0
                do {
                    AreaAsk();//Used from TextOutputs
                    Lines();//Used from TextOutputs
                    //User inputs area
                    area = Integer.parseInt(READER.readLine());
                    //check if area below 0
                    if (area <= 0) {
                        Error1();//Used from TextOutputs
                        // Lines();
                    } else {
                        //object creation and method calling
                        Main Trade = new Main(ITradeSpace.name,area);
                        Trade.ITradeSpaceTaxCalculation();
                        break;
                    }
                } while (area != 1548679582);
                break;
            } else if (userInput == 3) {
                // to check whether area is not negative or 0
                do {
                AreaAsk();//Used from TextOutputs
                Lines();//Used from TextOutput
                // User inputs area
                area = Integer.parseInt(READER.readLine());
                    //check if area below 0
                    if (area <= 0) {
                        Error1();
                        // Lines();
                    } else {
                        //object creation and method calling
                        Main Production = new Main(IProductionSpace.name, area);
                        Production.IProductionSpaceTaxCalculation();
                        break;
                    }
                } while (area != 1548679582);
            } else {
                Error1();//Used from TextOutputs
            }
        } while (userInput > 0 || userInput < 4);
    }

    @Override
    public float ILivingSpaceTaxCalculation() {
        float taxes;
        if (subsidiary == 0){
            taxes = ILivingSpace.taxK*area;
        } else
            taxes = ILivingSpace.taxK*area - ILivingSpace.taxK*area*((subsidiary)/100);
        System.out.println("Taxes for your living Space is - " + taxes + "$");
        return 0;
    }

    @Override
    public float IProductionSpaceTaxCalculation() {
        float taxes = area*IProductionSpace.taxK;
        System.out.println("Taxes for your Production Space is - " + taxes + "$");
        return 0;
    }

    @Override
    public float ITradeSpaceTaxCalculation() {
        float taxes;
        if (revenue < 100) {
            taxes = 0;
        } else {
            taxes = area * ITradeSpace.taxK;
        }
        System.out.println("Taxes for your Trade Space is - " + taxes + "$");
        return 0;
    }
}