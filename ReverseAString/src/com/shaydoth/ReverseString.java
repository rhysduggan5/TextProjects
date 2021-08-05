package com.shaydoth;

import java.util.Arrays;

public class ReverseString {

    /**
     * This is the entry point of the program
     *
     * @param args The arguments of the program
     */
    public static void main (String[] args) {

        if (args.length != 1) {
            System.out.println("Use java ReverseString -h for help");
            System.exit(0);
        }

        if (args[0].equals("-h")) {
            System.out.println("Usage: java reverseString string, where string is the string to be reversed.");
            System.exit(0);
        }

        System.out.printf("The reverse of %s is %s", args[0], reverseString(args[0]));
    }

    /**
     * Method to reverse a string
     *
     * @param val the string to be reversed
     * @return returns the string reversed
     */
    public static String reverseString(String val) {
        if (val.equals("")) return "";

        char[] vals = val.toCharArray();

        for (int i = 0; i < vals.length / 2; i++) {
            char temp = vals[i];
            vals[i] = vals[vals.length - 1 - i];
            vals[vals.length - 1 - i] = temp;
        }

        return Arrays.toString(vals);
    }
}
