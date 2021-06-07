/*
 *   UCF COP3330 SUMMER 2021 ASSIGNMENT 13 SOLUTION
 *   COPYRIGHT 2021 RAYME PERSAD
 */

/*Write a program to compute the value of an investment compounded over time.
The program should ask for the starting amount, the number of years to invest, the interest rate, and the number of periods per year to compound.


The formula you’ll use for this is A = P(1 + r/n)^(n*t) where

P is the principal amount.
r is the annual rate of interest.
t is the number of years the amount is invested.
n is the number of times the interest is compounded per year.
A is the amount at the end of the investment.
*/

package org.example;
import java.util.Scanner;

public class practiceexample13 {
    public static void main(String[] args) {

    Scanner in = new Scanner(System.in);

       System.out.print("What is the principal amount: "); //prompt for principal input
        double p = in.nextDouble();

       System.out.print("What is the rate: "); // prompt for rate input
        double r = in.nextDouble();

       System.out.print("What is the number of years: "); //prompt for years as input
        double t = in.nextDouble();

        System.out.print("What is the number of years: "); //prompt for years as input
        double n = in.nextDouble();


    double A = p*(1 +(r/n)^(n*t); //simple interest formula

    int y=(int)t; //print year w/o decimal

    private int ci;
    int s=ci = (int)A; //print interest w/o decimal

       System.out.println("After "+y+" years at "+r+"%, the investment will be worth $"+ci+"."); //print results
    }

}
