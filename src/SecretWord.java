package src;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.stream.Stream;

public class SecretWord {
    private ArrayList<String> secret;

    public SecretWord(ArrayList<String> secret) {
        this.secret = secret;
    }

    public ArrayList<String> generateSecret() {
        String secretWord = null;
        ArrayList<String> secret = new ArrayList<>();
        try (Stream<String> lines = Files.lines(Paths.get("dict.txt"))) {
            secretWord = lines.skip((int) (Math.random() * 5757)).findFirst().get();
        } catch (IOException e) {
            e.printStackTrace();
        }
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
