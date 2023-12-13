/*
 * Written by: Dan Jandel C. De Ramos
 * Polytechnic University of the Philippines Biñan
 * Bachelor of Science in Computer Engineering 2-1
 */

import java.util.Scanner;

public class Conditional_Statements_1{
    public static void main(String[]args){

        Scanner input = new Scanner(System.in);
        String letter;        

        //If-then-else
        System.out.println();
        System.out.println("\u2219 If-then-Else \u2219");
        System.out.println();

        //Nested-If-then-Else
        System.out.println();
        System.out.println("\u2219 Vowel or Not? \u2219");
        System.out.print("Type a letter: ");
        letter = input.nextLine();
        if(letter.equalsIgnoreCase("a")||
        letter.equalsIgnoreCase("e")||
        letter.equalsIgnoreCase("i")||
        letter.equalsIgnoreCase("o")||
        letter.equalsIgnoreCase("u")
        ){
            System.out.println("The letter " + letter + " is a vowel.");
        }else{
            System.out.println("Your input is not a vowel.");
        }
        System.out.println();
        input.close();
    }
}
