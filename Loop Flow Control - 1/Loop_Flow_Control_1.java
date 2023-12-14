/*
Written by: Dan Jandel C. De Ramos
Polytechnic University of the Philippines Biñan
Bachelor of Science in Computer Engineering 2-1
*/

import java.util.InputMismatchException;
import java.util.Scanner;

public class Loop_Flow_Control_1 {
    public static void main(String[]args){

        Scanner input = new Scanner(System.in);
        
        int number1;
        int number2;

        System.out.println("\u2219 Number Printer \u2219");
        System.out.print("Enter first number: ");
        number1 = input.nextInt();
        System.out.print("Enter second number: ");
        number2 = input.nextInt();                
        
        System.out.println("Printing selected numbers for ten times");
        for(int loop = 1; loop <= 10; loop++){
            System.out.println(number1 + "            " + number2);
        }


        int loop;
        int gradeCount=0;        
        int totalGrade=0;    
        int finalGrade;    
        int counter = 1;        
        System.out.println("\u2219 Final Grade Calculator \u2219");
        System.out.print("Enter the amount of grades: ");
        /*
        try statement on where user error is likely to occur. 
        catch statement tells the program what to do in case exception occurs
         */
        try{
            gradeCount = input.nextInt();
        }catch(InputMismatchException e){
            System.out.println("You have entered an invalid value. Please rerun the program");
            System.exit(0);
        }
        
        //Used another variable loop for the conditional statement to avoid changing the value of gradeCount
        loop = gradeCount;
        //Getting the sum of all the grades then dividing by the total number of grades
        while(loop!=0){            
            System.out.print("Enter grade " + counter + ": ");
            try{
                totalGrade = totalGrade + input.nextInt();
            }catch(InputMismatchException e){
                System.out.println("You have entered an invalid value. Please rerun the program");
                System.exit(0);
            }
            
            loop--;
            counter++;
        }
        finalGrade = totalGrade/gradeCount;
        System.out.println("Your final grade is " + finalGrade);
        input.close();
        System.out.println();
    }
}
