/*
 * Written by: Dan Jandel C. De Ramos
 * Polytechnic University of the Philippines Biñan
 * Bachelor of Science in Computer Engineering 2-1
 */

import java.util.Scanner;

public class Conditional_Statements_2{
    public static void main(String[]args){

        Scanner input = new Scanner(System.in);
        String houseType;
        String garageType;

        String houseType1 = "Single Family";
        String houseType2 = "Townhouse";
        String houseType3 = "Condominium";

        String garageType1 = "Interior/Exterior";
        String garageType2 = "Interior";
        String garageType3 = "Exterior";

        System.out.println();
        System.out.println("Enter the type of house you want to purchase");
        System.out.println("!!! Type the associated number only !!!");
        System.out.println("1 - " + houseType1);
        System.out.println("2 - " + houseType2);
        System.out.println("3 - " + houseType3);
        System.out.print("Type your choice: ");
        houseType = input.nextLine();        
        if(!(houseType.equals("1") ||
            houseType.equals("2") ||
            houseType.equals("3"))){ 
            System.out.println("You have entered an invalid value. Please rerun the program");
            System.exit(0);
        }

        System.out.println();

        System.out.println("Enter the type of garage you want");
        System.out.println("!!! Type the associated letter only !!!");
        System.out.println("A - " + garageType1);
        System.out.println("B - " + garageType2);
        System.out.println("C - " + garageType3);
        System.out.print("Type your choice: ");
        garageType = input.nextLine();
        input.close();
        if(!(garageType.equalsIgnoreCase("A") ||
            garageType.equalsIgnoreCase("B") ||
            garageType.equalsIgnoreCase("C"))){
            System.out.println("You have entered an invalid value. Please rerun the program");
            System.exit(0);
        }

        System.out.println();

        System.out.print("Your chosen house type is ");
        if(houseType == "1"){
            System.out.print(houseType1);
        }else if(houseType == "2"){
            System.out.print(houseType2);
        }else{
            System.out.print(houseType3);
        }
        if(garageType.equalsIgnoreCase("A")){
            System.out.print(" with either an " + garageType1 + " garage");
        }else if(garageType.equalsIgnoreCase("B")){
            System.out.print(" with an " + garageType2 + " garage");
        }else if(garageType.equalsIgnoreCase("C")){
            System.out.print(" with an " + garageType3 + " garage");
        }

        System.out.println(" [" + houseType + garageType.toUpperCase() + "]");
        System.out.println();
    }
}
