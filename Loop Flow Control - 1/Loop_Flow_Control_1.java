/*
 * Written by: Dan Jandel C. De Ramos
 * Polytechnic University of the Philippines Biñan
 * Bachelor of Science in Computer Engineering 2-1
 */

import java.util.Scanner;

public class Loop_Flow_Control_1 {
    public static void main(String[]args){

        Scanner input = new Scanner(System.in);
        
        int number1;
        int number2;

        System.out.print("Enter first number: ");
        number1 = input.nextInt();
        System.out.print("Enter second number: ");
        number2 = input.nextInt();                
        
        System.out.println("Printing selected numbers for ten times");
        for(int loop = 1; loop <= 10; loop++){
            System.out.println(number1 + "            " + number2);
        }

        
        int loop;
        int gradeCount;        
        int totalGrade=0;    
        int finalGrade;    
        int counter = 1;        
        System.out.println("\u2219 Final Grade Calculator \u2219");
        System.out.print("Enter the amount of grades: ");
        gradeCount = input.nextInt();
        loop = gradeCount;
        while(loop!=0){            
            System.out.print("Enter grade " + counter + ": ");
            totalGrade = totalGrade + input.nextInt();
            loop--;
            counter++;
        }
        finalGrade = totalGrade/gradeCount;
        System.out.println("Your final grade is " + finalGrade);
        input.close();
    }
}
