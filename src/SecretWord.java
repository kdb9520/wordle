package src;

import java.util.ArrayList;

public class SecretWord {
    private ArrayList<String> secret;

    public SecretWord(ArrayList<String> secret) {
        this.secret = secret;
    }

    public ArrayList<String> generateSecret() {
        String secretWord = null;
        ArrayList<String> secret = new ArrayList<>();
        for (int i = 0; i < secretWord.length(); i++) {
            secret.add(String.valueOf(secretWord.charAt(i)));
        }
        return secret;
    }

    public ArrayList<String> getSecret() {
        return secret;
    }

    public void setSecret(ArrayList<String> secret) {
        this.secret = secret;
    }
}
