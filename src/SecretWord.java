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

    public ArrayList<String> getSecret() {
        return secret;
    }

    public void setSecret(ArrayList<String> secret) {
        this.secret = secret;
    }
}
