package com.Shaydoth;

/**
 * Class for storing the total number of vowels
 * in a given string
 *
 * Only has one constructor that requires a string
 */
public class Vowels {

    private int as;
    private int es;
    private int is;
    private int os;
    private int us;

    public Vowels (String inputString) {
        char[] chars = inputString.toCharArray();

        //Loop through every character and tally the counts
        //of the vowels
        for (char ch : chars) {
            switch (ch) {
                case 'a' -> as++;
                case 'e' -> es++;
                case 'i' -> is++;
                case 'o' -> os++;
                case 'u' -> us++;
            }
        }
    }

    public String toString() {
        return "A count: " + as + "\n" +
                "E count: " + es + "\n" +
                "I count: " + is + "\n" +
                "O count: " + os + "\n" +
                "U count: " + us + "\n";
    }
}
