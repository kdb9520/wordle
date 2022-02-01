package src;

import java.util.ArrayList;

public class Wordle {
    public static void main(String[] args) {
        SecretWord word = new SecretWord(null);
        ArrayList<String> secret = word.generateSecret();
        word.setSecret(secret);
    }
}
