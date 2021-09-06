/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Abel Thomas
 */

import java.util.Scanner;

public class Solution04 {
    public static void main(String[] args){
        /*
        prompt user input for a noun, verb, adjective, and adverb
        print a statement combining user input into a story
         */

        Scanner input = new Scanner (System.in);
        System.out.print("Enter a noun: ");
        String noun = input.next();
        System.out.print("Enter a verb: ");
        String verb = input.next();
        System.out.print("Enter an adjective: ");
        String adjective = input.next();
        System.out.print("Enter an adverb: ");
        String adverb = input.next();

        System.out.println("Did you " + verb + " my " + adjective + " " + noun + " " + adverb + "? You're the worst!");
    }
}
