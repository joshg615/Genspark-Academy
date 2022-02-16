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
        setWordList();
        System.out.println(wordList);
        startGame();

    }

    public static void startGame(){
        System.out.println("Lets play hangman");
        getRandomWord();
        setWordLines();
        System.out.println(wordList);
        do{
            gameVisual();
            listWordLine();
            missedLetterLines();
            askQuestion();
            takeInput();
            compareLetters(currentUserChoice);
        }while(choice.equalsIgnoreCase("y"));
    }

    public static void gameEnd(){
        System.out.println("Sorry you have lost");
        System.out.println("Would you like to play again? Y/N");
        try {
            choice = reader.readLine();
        }catch (IOException e){

        }
        if(choice.equalsIgnoreCase("Y")){
            incorrectGuesses = 0;
            wordLines.clear();
            randWord.clear();
            startGame();
        }
    }

    //compares the user input with letters in the word and if it has a match updates wordLines and if no match incorrect++
    public static void compareLetters(String currentUserChoice){
        int count = 0;
        int change = 0;
        for(String i : randWord){
            if (currentUserChoice.equalsIgnoreCase(i)){
                System.out.println("Correct");
                wordLines.set(count, i);
                change++;
            }
            else if (count == randWord.size() -1 && change == 0){
                incorrectGuesses++;
            }
            if(incorrectGuesses == 4){
                gameEnd();
            }
            count++;
        }
    }

    //takes user input
    public static void takeInput(){
        try {
            Main.currentUserChoice = reader.readLine();

        }catch (IOException e){

        }
    }

    //only prints guess a letter could put elsewhere
    public static void askQuestion(){
        System.out.println("Guess a letter!");

    }

    public static void missedLetterLines(){

    }

    //sets the blank lines for the word you need to guess
    public static void setWordLines(){
        for(int i = 1; i <= randWord.size(); i++){
            wordLines.add("-");
        }
    }

    //list the wordLine
    public static void listWordLine(){
        System.out.println(wordLines.toString());
        System.out.println();


    }

    //sets the game visuals for the hangman games and updates depending on how many incorrect guesses are made
    public static void gameVisual(){

        if(incorrectGuesses == 0){
            System.out.println("+---+");
            System.out.println(("    |"));
            System.out.println(("    |"));
            System.out.println(("    |"));
        }
        else if(incorrectGuesses == 1){
            System.out.println("+---+");
            System.out.println(("O   |"));
            System.out.println(("    |"));
            System.out.println(("    |"));

        }
        else if(incorrectGuesses == 2){
            System.out.println("+---+");
            System.out.println("O  |");
            System.out.println("|  |");
            System.out.println("   |");


        }
        else if(incorrectGuesses == 3){
            System.out.println("+---+");
            System.out.println(("O  |"));
            System.out.println(("|  |"));
            System.out.println(("|  |"));

        }
    }


    //get a random word from an array
    public static void getRandomWord(){
       Random rand = new Random();
       String randomWord = wordList.get(rand.nextInt(wordList.size()));
       for(int i = 0; i < randomWord.length(); i++){
           randWord.add(i , String.valueOf(randomWord.charAt(i)));
           System.out.println(randWord);
       }
    }

    public static void setWordList() {
        wordList.add("catd");
        wordList.add("dog");
        wordList.add("rodeo");
    }
}
