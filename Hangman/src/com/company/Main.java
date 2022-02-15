package com.company;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.io.InputStreamReader;
import java.io.BufferedReader;



public class Main {

static ArrayList<String> wordList = new ArrayList<>();
static ArrayList<String> randWord = new ArrayList<>();
static int incorrectGuesses = 0;
static String choice = "y";
static InputStreamReader input = new InputStreamReader(System.in);
static BufferedReader reader = new BufferedReader(input);
static String currentUserChoice;
static ArrayList<String>wordLines = new ArrayList<>();


    public static void main(String[] args) {
	// write your code here
        System.out.println("Lets play hangman");
        setWordList();
        getRandomWord();
        setWordLines();
        System.out.println(wordList);
        startGame();

    }

    public static void startGame(){
        do{
            gameVisual();
            //setWordLines();
            listWordLine();
            missedLetterLines();
            askQuestion();
            takeInput();
            compareLetters(currentUserChoice);
        }while(choice.equalsIgnoreCase("y"));
    }

    public static void compareLetters(String currentUserChoice){
        for(String i : randWord){
            if (currentUserChoice.equalsIgnoreCase(i)){
                System.out.println("Correct");
                wordLines.remove(randWord.get(randWord.indexOf(i)));
                wordLines.add(randWord.indexOf(i), i);
            }
        }
    }

    public static void takeInput(){
        try {
            Main.currentUserChoice = reader.readLine();

        }catch (IOException e){

        }
    }


    public static void askQuestion(){
        System.out.println("Guess a letter!");

    }

    public static void missedLetterLines(){

    }

    public static void setWordLines(){
        for(int i = 1; i <= randWord.size(); i++){
            wordLines.add("-");
        }
    }

    public static void listWordLine(){
        System.out.println(wordLines.toString());
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
            System.out.println("    |");


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
       String randomWord = wordList.get(rand.nextInt(wordList.size()));
       for(int i = 0; i < randomWord.length(); i++){
           randWord.add(i , String.valueOf(randomWord.charAt(i)));
           System.out.println(randWord);
       }
       //return randomWord;
    }

    public static void setWordList() {
        wordList.add("cat");
        wordList.add("dog");
        wordList.add("rodeo");
    }
}
