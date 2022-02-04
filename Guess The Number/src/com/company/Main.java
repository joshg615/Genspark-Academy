package com.company;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        //Initializing variables
        boolean test = true;
        String name = "";
        int userChoice = 0;
        Scanner input = new Scanner(System.in);
        String choice;

        //Start of guessing loop
        do{
             //Start of program
             System.out.println("Hello! What is your name?");
             //Take Name Input
            try {
                name = input.next();
            }catch(InputMismatchException e){
                System.out.println("That's not a name!");
            }
             //start guess statement
             System.out.println("Well, " + name + " I am thinking of a number between 1 and 20 \n"
             + "Take a guess.");

             //gets a random number between 1-20
             int cpuNum = new Random().nextInt((20) + 1);

            //loop giving user six tries

               for (int i = 1; i <= 6; i++) {
                   try {
                       userChoice = input.nextInt();
                   }catch(InputMismatchException e){
                       System.out.println("That's not a number!");
                       break;
                   }
                   if (userChoice > cpuNum) {
                       System.out.println("Your number is too high \n" +
                               "Take a guess");
                   } else if (userChoice < cpuNum) {
                       System.out.println("your number is too low \n" +
                               "Take a guess.");
                   } else if (userChoice == cpuNum) {
                       System.out.println("Good job, " + name + " You guessed my number in " + i + " guesses");
                       break;
                   }

               }
             //asking if you want to play again
            System.out.println("Would you like to play again? (y/n)");
            choice =  input.next();

         }while(choice.equals("y"));


    }
}
