package com.Shaydoth;

public class Main {

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Use java Main -h for help");
            System.exit(0);
        }

        if (args[0].equals("-h")) {
            System.out.println("Usage: java Main string, where string is the string to be checked");
            System.exit(0);
        }

        if (checkForPalindrome(args[0])) {
            System.out.printf("%s is a palindrome", args[0]);
        } else {
            System.out.printf("%s is not a palindrome", args[0]);
        }
    }

    /**
     * Method to check if a string is a palindrome
     * @param string The string that is being checked
     * @return A boolean representing if the string is palindromic or not
     */
    public static boolean checkForPalindrome(String string) {
        char[] chars = string.toCharArray();
        int j = chars.length - 1;

        for (int i = 0; i < chars.length / 2; i++) {
            if (chars[i] != chars[j--]) return false;
        }

        return true;
    }
}
