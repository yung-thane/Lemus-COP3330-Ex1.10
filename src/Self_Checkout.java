/*
 *  UCF COP3330 Fall 2021 Assignment 1.10 Solution
 *  Copyright 2021 Ronald Lemus
 */


import java.util.Scanner;

public class Self_Checkout {
    public static void main(String [] args){
        System.out.print("Enter the price of item 1: ");
        Scanner price1Inp = new Scanner(System.in);
        String price1String = price1Inp.nextLine();

        System.out.print("Enter the quantity of item 1: ");
        Scanner quant1Inp = new Scanner(System.in);
        String quant1String = quant1Inp.nextLine();

        System.out.print("Enter the price of item 2: ");
        Scanner price2Inp = new Scanner(System.in);
        String price2String = price2Inp.nextLine();

        System.out.print("Enter the quantity of item 2: ");
        Scanner quant2Inp = new Scanner(System.in);
        String quant2String = quant2Inp.nextLine();

        System.out.print("Enter the price of item 3: ");
        Scanner price3Inp = new Scanner(System.in);
        String price3String = price3Inp.nextLine();

        System.out.print("Enter the quantity of item 3: ");
        Scanner quant3Inp = new Scanner(System.in);
        String quant3String = quant3Inp.nextLine();

        int price1 = Integer.parseInt(price1String);
        int quant1 = Integer.parseInt(quant1String);
        int price2 = Integer.parseInt(price2String);
        int quant2 = Integer.parseInt(quant2String);
        int price3 = Integer.parseInt(price3String);
        int quant3 = Integer.parseInt(quant3String);

        int subtotal1 = price1 * quant1;
        int subtotal2 = price2 * quant2;
        int subtotal3 = price3 * quant3;
        double subtotalfinal = subtotal1 + subtotal2 +subtotal3;
        double tax = subtotalfinal * .055;
        double total = subtotalfinal + tax;

        System.out.printf("Subtotal: $%.2f\n",subtotalfinal);
        System.out.printf("Tax: $%.2f\n", tax);
        System.out.printf("Total: $%.2f", total);


    }
}
