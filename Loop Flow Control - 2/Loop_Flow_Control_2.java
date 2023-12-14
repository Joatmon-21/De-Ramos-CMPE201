/*
 * Written by: Dan Jandel C. De Ramos
 * Polytechnic University of the Philippines Biñan
 * Bachelor of Science in Computer Engineering 2-1
 */

import java.util.Scanner;

public class Loop_Flow_Control_2{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);        
                
        double factorialBase;
        double factorial=1;
        double loop;

        System.out.println("\u2219 Factorial Calculator \u2219");
        System.out.print("Enter a number: ");
        factorialBase = input.nextDouble();
        loop = factorialBase;
        while(loop!=1){             
            factorial = factorial*loop;
            loop--;            
        }                             
        System.out.print((int)factorialBase + "!" + " = " + factorial + "\n \n");                

        int baseNum;

        System.out.println("\u2219 Multiplication Table Generator \u2219");        
        System.out.print("Enter a number: ");
        baseNum = input.nextInt();
        input.close();
        int loop2 = 1;
        do{
            System.out.println(loop2 + " x " + baseNum + " = " + (baseNum*loop2));
            loop2++;
        }while(loop2!=11);
    }
}