package com.company;

import java.sql.SQLOutput;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        //Initializing Scanner
        Scanner input = new Scanner(System.in);
        int choice = 0;
        // printing Statement
        System.out.println("You are in a land full of dragons. In front of you, \n"  +
                            "you see two cave. In one cave, the dragon is friendly \n" +
                            "and will share his treasure with you. The other dragon \n" +
                            "is greedy and hungry and will eat you on sight \n" +
                            "Which cave will you go into? (1 or 2)");

        //taking the choice user input
       try {
            choice = input.nextInt();
       }catch(InputMismatchException e)
       {
           System.out.println("That is not a number!");
       }
        if(choice == 1) {
            System.out.println("You approach the cave... \n" +
                                            "it is dark and spooky... \n"+
                                            "A large dragon jumps out in front of you! He opens his jaws and...\n " +
                                            " Gobbles you down in one bite!");
        }else if(choice ==2){
            System.out.println("Treasure!!!!");
        }else System.out.println("Invalid choice. The dragon chased you out the dungeon");





    }
}
