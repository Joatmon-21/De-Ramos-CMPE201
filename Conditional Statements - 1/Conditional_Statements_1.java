/*
 * Written by: Dan Jandel C. De Ramos
 * Polytechnic University of the Philippines Biñan
 * Bachelor of Science in Computer Engineering 2-1
 */

import java.util.Scanner;
//package for handling the exception with the same namethrown by the Scanner in the event of an input mismatch
import java.util.InputMismatchException;

public class Conditional_Statements_1{
    public static void main(String[]args){

        Scanner input = new Scanner(System.in);
        //Could've used char in order to save memory, but due to the scale of the program it is unnecessary
        String letter;         
        //used floats in case the user wants to compare decimal numbers    
        float number1 = 0;
        float number2 = 0;

        //If-then-else
        System.out.println();
        System.out.println("\u2219 Vowel or Not? \u2219");
        System.out.print("Type a letter: ");
        letter = input.nextLine();
        /*Checks whether the input is a vowel or not
        Used else statement since even if it is a word it is still not a word*/
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

        //Nested if-then-else
        System.out.println("\u2219 Value Comparison \u2219");
        System.out.print("Enter a number: ");
        /*try statement, where user error (exception) is likely to occur
        catch statement to instruct the program what to do if a certain or if an exception occurs
        can use a loop to keep the program running in case of an exception but decided to keep it simple*/
        try{
            number1 = input.nextFloat();        
        }catch(InputMismatchException e){
            System.out.println("You have entered an invalid value. Please rerun the program");
            System.exit(0);
        }
        System.out.print("Enter a number again: ");
        try{
            number2 = input.nextFloat();
        }catch(InputMismatchException e){
            System.out.println("You have entered an invalid value. Please rerun the program");
            System.exit(0);
        }
        
        if(number1==number2){                        
            System.out.println(number1 + " is equal to " + number2);
        }else if(number1>number2){
            System.out.println(number1 + " is greater than " + number2);
        }else if(number1<number2){
            System.out.println(number1 + " is less than " + number2);
        }
        input.close();
    }
}
