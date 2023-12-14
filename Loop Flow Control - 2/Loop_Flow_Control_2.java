/*
 * Written by: Dan Jandel C. De Ramos
 * Polytechnic University of the Philippines Biñan
 * Bachelor of Science in Computer Engineering 2-1
 */

import java.util.Scanner;
import java.util.InputMismatchException;

public class Loop_Flow_Control_2{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);        
        
        //Factorial Calculator Code
        //Used double instead of int due to factorials having the tendency to get so big        
        double factorialBase=0;
        double factorial=1;
        double loop;

        System.out.println("\u2219 Factorial Calculator \u2219");
        System.out.print("Enter a number: ");
        try{
            factorialBase = input.nextDouble();
        }catch(InputMismatchException e){
            System.out.println("You have entered an invalid value. Please rerun the program");
            System.exit(0);
        }
        
        loop = factorialBase;
        while(loop!=1){             
            factorial = factorial*loop;
            loop--;            
        }                             
        System.out.print((int)factorialBase + "!" + " = " + factorial + "\n");                
        System.out.println();
        //Multiplication Table Code
        int baseNum=0;

        System.out.println("\u2219 Multiplication Table Generator \u2219");        
        System.out.print("Enter a number: ");
        try{
            baseNum = input.nextInt();
        }catch(InputMismatchException e){
            System.out.println("You have entered an invalid value. Please rerun the program");
            System.exit(0);
        }
        
        input.close();
        int loop2 = 1;
        do{
            System.out.println(loop2 + " x " + baseNum + " = " + (baseNum*loop2));
            loop2++;
        }while(loop2!=11);
    }
}