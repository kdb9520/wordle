package src;

import java.util.ArrayList;
import java.util.Scanner;

public class Guess {
    private Scanner in = new Scanner(System.in);
    private static int currentGuessNumber = 1;
    private int guessNumber;
    private ArrayList<String> guess;
    private int correctPositions;
    private int wrongPositions;

    public Guess(ArrayList<String> guess) {
        this.guess = guess;
        this.guessNumber = currentGuessNumber++;
        this.correctPositions = 0;
        this.wrongPositions = 0;
    }

    public int getCorrectPositions() {
        return correctPositions;
    }

    public void setCorrectPositions(int correctPositions) {
        this.correctPositions = correctPositions;
    }

    public int getWrongPositions() {
        return wrongPositions;
    }

    public void setWrongPositions(int wrongPositions) {
        this.wrongPositions = wrongPositions;
    }

    public ArrayList<String> getGuess() {
        return this.guess;
    }
}
