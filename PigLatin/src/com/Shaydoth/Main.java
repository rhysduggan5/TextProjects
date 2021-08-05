package com.Shaydoth;

import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    private final static String firstConsonantsRegex = "^[^aeiou]+";
    private final static Pattern firstConsonantsPattern = Pattern.compile(firstConsonantsRegex);

    public static void main(String[] args) {

        if (args.length != 1) {
            System.out.println("Use java Main -h for help");
            System.exit(0);
        }

        if (args[0].equals("-h")) {
            System.out.println("Usage: java Main string, where string is the string to be converted to pig latin.");
            System.exit(0);
        }

        System.out.printf("The reverse of %s is %s", args[0], convertToPigLatin(args[0]));
    }

    /**
     * Method to convert a string to pig latin with the rules:
     *
     * Remove the first group of consonants and put them at the end
     * then add "ay " to the end of the expression
     *
     * @param string The string to be converted to pig latin
     * @return Returns a string of the converted value
     */
    public static String convertToPigLatin(String string) {
        String[] words = string.split(" ");
        StringBuilder message = new StringBuilder();

        for (String word : words) {
            Matcher m = firstConsonantsPattern.matcher(word);
            String cons = "";
            while(m.find()) {
                cons = m.group(0);
            }

            if (!Objects.equals(cons, "")) {
                word = word.replaceAll(firstConsonantsRegex, "");
                word += cons;
            }

            word += "ay ";

            message.append(word);
        }

        return message.toString();
    }

}
