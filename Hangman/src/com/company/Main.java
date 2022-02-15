package com.company;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.io.InputStreamReader;
import java.io.BufferedReader;



public class Main {

static ArrayList<String> wordList = new ArrayList<>();
static String randWord = "";
static int incorrectGuesses = 0;
static String choice = "y";
static InputStreamReader input = new InputStreamReader(System.in);
static BufferedReader reader = new BufferedReader(input);
static String currentUserChoice = "";



    public static void main(String[] args) {
	// write your code here
        System.out.println("Lets play hangman");
        setWordList();
        getRandomWord();
        System.out.println(wordList);
        startGame();

    }

    public static void startGame(){
        do{
            gameVisual();
            listWordLine();
            missedLetterLines();
            askQuestion();
            currentUserChoice = takeInput();
        }while(choice.equalsIgnoreCase("y"));
    }

    public static String takeInput(){
        try {
            String choice = reader.readLine();
            return choice;

        }catch (IOException e){

        }
        return choice;
    }


    public static void askQuestion(){
        System.out.println("Guess a letter!");

    }

    public static void missedLetterLines(){

    }

    public static void listWordLine(){
        for(int i = 0; i <= randWord.length() - 1; i++){
            System.out.print("_");
        }
        System.out.println();
        System.out.println();


    }

    public static void gameVisual(){

        if(incorrectGuesses == 0){
            System.out.println("+---+");
            System.out.println(("    |"));
            System.out.println(("    |"));
            System.out.println(("    |"));
        }
        else if(incorrectGuesses == 1){
            System.out.println("+---+");
            System.out.println((" O  |"));
            System.out.println(("    |"));
            System.out.println(("    |"));

        }
        else if(incorrectGuesses == 2){
            System.out.println("+---+");
            System.out.println((" O |"));
            System.out.println((" | |"));
            System.out.println("   |");


        }
        else if(incorrectGuesses == 3){
            System.out.println("+---+");
            System.out.println((" O |"));
            System.out.println((" | |"));
            System.out.println((" | |"));

        }
    }

    public static void getRandomWord(){
       Random rand = new Random();
       randWord = wordList.get(rand.nextInt(wordList.size()));
       //return randomWord;
    }

    public static void setWordList() {
        wordList.add("cat");
        wordList.add("dog");
        wordList.add("rodeo");
    }
}
