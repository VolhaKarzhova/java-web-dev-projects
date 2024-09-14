package org.launchcode;

import java.util.Arrays;
import java.util.Scanner;

public class StringsTask2 {
    private static final String quote = "Alice was beginning to get very tired of sitting by her sister on the bank, " +
            "and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had " +
            "no pictures or conversations in it, ‘and what is the use of a book,’ thought Alice ‘without pictures or " +
            "conversation?’";

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Type the word to see where it presents in the first sentence of Alice’s Adventures" +
                " in Wonderland: ");
        String word = input.nextLine().toLowerCase();
        boolean isPhraseFound = quote.toLowerCase().contains(word);
        if(isPhraseFound) {
            System.out.println("This word length is: " + word.length());
            System.out.println("The index of the first occurrence of this word in the sentence is: " + quote.indexOf(word));
            System.out.println(quote.toLowerCase().replace(word.concat(" "), ""));
        } else {
            System.out.println("Sorry, but this word was not found in the sentence");
        }

    }
}
