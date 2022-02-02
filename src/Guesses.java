package src;

import java.util.ArrayList;

public class Guesses {
    private ArrayList<Guess> guessList;

    public Guesses() { this.guessList = new ArrayList<>(); }

    public void addGuess(Guess guess) { this.guessList.add(guess); }

    public void displayGuesses() {
        for (Guess g: this.guessList) {
            System.out.println(g);
        }
    }
}
