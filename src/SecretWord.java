package src;

import java.util.ArrayList;

public class SecretWord {
    private ArrayList<String> secret;

    public SecretWord(ArrayList<String> secret) {
        this.secret = secret;
    }

    public void generateSecret(String word) {
        ArrayList<String> secret = new ArrayList<>();
        for (int i = 0; i < word.length(); i++) {
            secret.add(String.valueOf(word.charAt(i)));
        }
        setSecret(secret);
    }

    public void checkGuess(Guess guess) {
        int correct = 0;
        int wrong = 0;
        for (int i = 0; i < 5; i++) {
            if (guess.getGuess().get(i).equals(secret.get(i))) {
                correct++;
                System.out.println(guess.getGuess().get(i) + " is correctly positioned!");
                guess.getGuess().set(i, "G:" + guess.getGuess().get(i) + ":G");
            } else {
                if (secret.contains(guess.getGuess().get(i))) {
                    wrong++;
                    System.out.println(guess.getGuess().get(i) + " is in the wrong spot!");
                    guess.getGuess().set(i, "Y:" + guess.getGuess().get(i) + ":Y");
                } else {
                    System.out.println(guess.getGuess().get(i) + " is not in the word!");
                }
            }
        }
        guess.setCorrectPositions(correct);
        guess.setWrongPositions(wrong);
    }

    public ArrayList<String> getSecret() {
        return secret;
    }

    public void setSecret(ArrayList<String> secret) {
        this.secret = secret;
    }
}
