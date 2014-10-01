////////////////////////////////////////////////////////////////////////////////
//Ashley Faulkner
//Homework 05
//September 30th, 2014
//Burger King Java Program

//The purpose of this program is to, given a varible, classify and explor furthur into the order that a customer wants
//Steps: write, compile, run, upload

import java.util.Scanner;
    //import the scanner data
public class BurgerKing{
        //class for the java
        public static void main(String [] args){
            //main method for the java program
    //import the data
        Scanner myScanner;
            //call the scanner an object
        myScanner = new Scanner(System.in);
            //call the scanner a constructor
        System.out.print("Enter a letter to indicate a choice of burger, soda, fries: " );
            //prompting the user to enter a varible
        String answer= myScanner.next();
        
        if (answer.equals("B"))||(answer.equals("b")){
            System.out.print("Do you want cheese or nothing?: ");
            if (answer.equals("A"))||(answer.equals("a")){
                System.out.println("you ordered a burger with all the fixings");
            }   //end the if statement
            if (answer.equals("C"))||(answer.equals("c")){
                System.out.println("You ordered a burger with cheese");
            }   //end the if statament
            if (answer.equals("n"))||(answer.equals("N")){
                System.out.println("you ordered a burger with no fixings");
            }   //end the if statement
        }   //end if statement
        
        if (answer.equals("S"))||(answer.equals("s")){
            System.out.print("What kind of soda: ");
                if (answer.equals("s"))||(answer.equals("S")){
                    System.out.println("You ordered sprite");
                }   //end the if statement
                if (answer.equals("p"))||(answer.equals("P")){
                    System.out.println("You ordered Pespi");
                }   //end the if statement
                if (answer.equals("m"))||(answer.equals("M")){
                    System.out.println("You ordered mountian dew"); 
                }   //end the if statement
        }   //end the if statement
        
        if (answer.equals("F"))||(answer.equals("f")){
            System.out.print("Do you want small or large fries (L,l,S,s): ");
                if (answer.equals("l"))||(answer.equals("L")){
                    System.out.println("You ordered large fries");
                }   //end if statement
                if (answer.equals("S"))||(answer.equals("s")){
                    System.out.println("You ordered small fries");
                }   //end the if statement
        }   //end the if statement
        else{
            System.out.println("you did not enter an acceptable varible");
            return;
        }   //end the else statemnt
    
            
        }   //end the main mehtod
}   //end the class
