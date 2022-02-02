package src;

import java.io.File;
import java.util.Scanner;

public class Wordle {
    public static void main(String[] args) {
        String word = null;
        try {
            Scanner input = new Scanner("C:\\Users\\kelle\\IdeaProjects\\wordle\\src\\dict.txt");
            File file = new File(input.nextLine());
            input = new Scanner(file);
            int stopPoint = (int) (Math.random() * 5757);
            int i = 0;
            while (input.hasNextLine() && i < stopPoint) {
                word = input.nextLine();
                i++;
            }
            input.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        new Wordle(word);
    }

    private GuessCheck check;
    private SecretWord secretWord;

    public Wordle(String word) {
        this.check = new GuessCheck();
        this.secretWord = new SecretWord(null);
        runGame(word);
    }

    public void runGame(String word) {
        int count = 0;
        int correct = 0;
        System.out.println("Welcome to Wordle!");
        System.out.println("Enter 5 letter word guesses (\"quit\" to quit)");
        while (count < 6 && correct < 5) {
            this.secretWord.generateSecret(word);
            Guess guess = this.check.getGuess();
            secretWord.checkGuess(guess);
            correct = guess.getCorrectPositions();
            count++;
            check.setScore(1);
            System.out.println(guess);
            if (correct == 5) {
                System.out.println("You won!");
            } else if (count == 6) {
                System.out.println("You lose!");
            }
        }
        System.out.println("Wordle score: " + check.getScore());
    }
}
