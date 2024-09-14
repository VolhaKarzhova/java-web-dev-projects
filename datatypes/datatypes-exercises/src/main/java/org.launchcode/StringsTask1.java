package org.launchcode;

import java.util.Scanner;

public class StringsTask1 {
    private static final String quote = "Alice was beginning to get very tired of sitting by her sister on the bank, " +
            "and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had " +
            "no pictures or conversations in it, ‘and what is the use of a book,’ thought Alice ‘without pictures or " +
            "conversation?’";

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Type the phrase to see if that is present in the first sentence of Alice’s Adventures in " +
                "Wonderland :");
        String phrase = input.nextLine();
        boolean isPhraseFound = quote.toLowerCase().contains(phrase.toLowerCase());
        System.out.println("Is this phrase found in the sentence? " + isPhraseFound);
    }
}
