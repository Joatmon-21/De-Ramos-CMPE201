/*
 * Written by: Dan Jandel C. De Ramos
 * Polytechnic University of the Philippines Biñan
 * Bachelor of Science in Computer Engineering 2-1
 */

import java.util.Scanner;
import java.util.InputMismatchException;

public class Conditional_Statements_1{
    public static void main(String[]args){

        Scanner input = new Scanner(System.in);
        String letter;             
        float number1 = 0;
        float number2 = 0;

        //If-then-else
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

        //Nested if-then-else
        System.out.println("\u2219 Value Comparison \u2219");
        System.out.print("Enter a number: ");
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
