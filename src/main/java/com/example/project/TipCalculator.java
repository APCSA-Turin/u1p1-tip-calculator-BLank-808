package com.example.project;
import java.util.Scanner;
public class TipCalculator {
    //WRITE YOUR PROGRAM IN calculateTip
    public static String calculateTip(int people, int percent, double cost) { //You must use these  variable in your calculations
        //DO NOT DELETE ANY OF THE CODE BELOW      
        StringBuilder result = new StringBuilder();
        double tip=(int)(((cost*(percent/100.0))*100.0)+.5)/100.0;
        double costAP= ((tip*100 + cost*100)/100);
                       
        result.append("-------------------------------\n");
        result.append("Total bill before tip: "+"$"+ cost +"\n"); //concatenate to this string. DO NOT ERASE AND REWRITE
        result.append("Total percentage: "+ percent+"%\n");
        result.append("Total tip: " +"$"+ tip+ "\n");
        result.append("Total Bill with tip: "+"$"+ costAP+ "\n");
        result.append("Per person cost before tip: "+"$"+((int)(((cost/people)*100.0)+.5)/100.0)+ "\n");
        result.append("Tip per person: "+"$"+((int)(((tip/people)*100.0)+.5)/100.0)+"\n");
        result.append("Total cost per person: "+"$"+ ((int)(((costAP/people)*100.0)+.5)/100.0)+"\n");
        result.append("-------------------------------\n");


        return result.toString();
    }
     //TEST YOUR PROGRAM IN main
     public static void main(String[] args) {
        //try different values for people, percent, and cost to test your program before running test cases
        Scanner scan=new Scanner(System.in);
        System.out.println("Hello");
        System.out.print ("How many people are paying? ");
        int people=scan.nextInt(); 
        System.out.print ("what percent tip are you giving? ");
        int percent=scan.nextInt();
        System.out.print ("what the cost of the meal? ");
        double cost=scan.nextDouble(); 
        scan.close();             
        System.out.println(calculateTip(people,percent,cost));
    }
}
        
