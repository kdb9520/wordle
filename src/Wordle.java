package src;

import java.util.ArrayList;

public class Wordle {
    public static void main(String[] args) {
        new Wordle();
    }

    public Wordle() {
        runGame();
    }

    public void runGame() {
        SecretWord word = new SecretWord(null);
        ArrayList<String> secret = word.generateSecret();
        word.setSecret(secret);
    }
}
