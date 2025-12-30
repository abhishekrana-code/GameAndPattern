package com.tricks;

import java.util.Scanner;

public class Guessing_Number {
    public static void guessCorrect()
    {
        Scanner sc=new Scanner(System.in);

        int target=1+(int)(100*Math.random());
        int k=5;
        System.out.println("A number is chosen between 1 and 100");
        System.out.println("You have " + k + "attempts to guess the correct number.");
        for(int i=0;i<k;i++)
        {
            System.out.println("Enter your guess:");
            int guess = sc.nextInt();
            if(guess==target){
                System.out.println("Congrates! You Won");
                sc.close();
                return;
            } else if (guess<target) {
                System.out.println("The number is Greater than " +guess);
            }
            else {
                System.out.println("The number is less than " +guess);
            }
        }
        System.out.println("you've exhausted all attempts: The correct number was: "+target);
        sc.close();
    }

    public static void main(String[] args) {
        guessCorrect();
    }
}
