package com.Shaydoth;

public class Main {

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Use java Main -h for help");
            System.exit(0);
        }

        if (args[0].equals("-h")) {
            System.out.println("Usage: java Main string, where string is the string to be converted to pig latin.");
            System.exit(0);
        }

        System.out.printf("The word count of \"%s\" is %d", args[0], wordCount(args[0]));
    }

    /**
     * Method to count the number of words in a string
     *
     * A word here is defined as any length of any characters
     * surrounded by two spaces or the start or end of the string
     *
     * @param string The string to be counted
     * @return An int of the word count of the string
     */
    public static int wordCount(String string) {
        return string.split(" ").length;
    }
}
