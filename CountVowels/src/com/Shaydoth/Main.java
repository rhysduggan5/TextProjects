package com.Shaydoth;

public class Main {

    public static void main(String[] args) {

        if (args.length != 1) {
            System.out.println("Use java Main -h for help");
            System.exit(0);
        }

        if (args[0].equals("-h")) {
            System.out.println("Usage: java Main string, where string is the string to be tallied");
            System.exit(0);
        }

        Vowels vowels = new Vowels(args[0]);

        System.out.printf("The reverse of %s is \n%s", args[0], vowels.toString());
    }
}
