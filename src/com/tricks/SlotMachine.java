package com.tricks;

import java.util.Random;
import java.util.Scanner;

public class SlotMachine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int balance = 100;
        int bet;
        int payout;
        String[] row;

        System.out.println("Welcome to my slots");
        System.out.println("Symbols: 🍒 🍉 🍌 🍆 🍑");

        while (balance > 0) {
            System.out.println("Current balance = $" + balance);
            System.out.println("place your bet amount: ");
            bet = sc.nextInt();

            if (bet > balance) {
                System.out.println("insufficient balance");
                continue;
            } else if (bet <= 0) {
                System.out.println("Bet must be greater than 0");
                continue;
            } else {
                balance -= bet;
            }
            System.out.println("Spinning......");
            row = spinRow();
            printRow(row);
            payout=getPayout(row,bet);
            if(payout >0){
                System.out.println("you won $"+payout);
                balance+=payout;
            }
            else {
                System.out.println("Sorry you lost this round");
            }

        }
    }
    static String[] spinRow(){
        String[] symbols={"🍒","🍉","🍌","🍆","🍑"};
        String[] row= new String[3];
        Random rn =new Random();
        for(int i=0;i<3;i++)
        {
            row[i]=symbols[rn.nextInt(symbols.length)];
        }
        return row;
    }
    static void printRow(String[] row){
        System.out.println("*********************");
        System.out.println(" " + String.join(" | ",row));
    }
    static  int getPayout(String[] row,int bet){
        if(row[0].equals(row[1])&&row[1].equals(row[2]))
        {
            return switch (row[0])
            {
                case "🍒"-> bet*3;
                case "🍉"-> bet*4;
                case "🍌"-> bet*5;
                case "🍆"-> bet*10;
                case "🍑"-> bet*30;
                default -> 0;
            };
        }
        return 0;
    }
}

