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

    public Wordle(String word) {
        runGame(word);
    }

    public void runGame(String word) {
        SecretWord secretWord = new SecretWord(null);
        secretWord.generateSecret(word);
    }
}
