package com.tricks;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random rn = new Random();
        String[] choices={"rock","paper","scissor"};
        String yourChoice;
        String computerChoice;
        String playAgain ="yes";
        do {
            System.out.print("Enter your choice : ");
            yourChoice=sc.nextLine().toLowerCase();
            if(!yourChoice.equals("rock")&&!yourChoice.equals("paper")&&!yourChoice.equals("scissor"))
            {
                System.out.println("invalid choice ");
            }
            computerChoice=choices[rn.nextInt(3)];
            System.out.println("Computer choice : "+computerChoice);

            if(yourChoice.equals(computerChoice)){
                System.out.println("It's a tie ");
            }
            else if((yourChoice.equals("rock")&&computerChoice.equals("scissor"))||(yourChoice.equals("paper")&&computerChoice.equals("rock"))||(yourChoice.equals("scissor")&&computerChoice.equals("paper")))
            {
                System.out.println("you win");
            }
            else {
                System.out.println("you loss");
            }
            System.out.println("Play again (yes/no): ");
            playAgain=sc.nextLine().toLowerCase();

        }while (playAgain.equals("yes"));
        System.out.println("Thanks for playing");
        sc.close();
    }
}
