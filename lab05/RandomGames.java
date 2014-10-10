////////////////////////////////////////////////////////////////////////////////
//Ashley Faulkner
//September 25th, 2014
//Lab 05
//Random Games Java Program

//The purpose of this lab is to given a game by the user, outputs random numbers or random cards from a deck
    //first, write the program
    //second, compile the code
    //third, run the code
    //fourth, upload to github

import java.util.Scanner;
    //importing th data from the java scanner
public class RandomGames{
        //declare the class
        public static void main (String [] args ){
            //declaring the method necessary for the java program
            
        //import the data
        Scanner myScanner;
            //declaring the scanner an object
        myScanner= new Scanner(System.in);
            //call the scanner a constructor
        System.out.print("Enter R or r for Roulette, C or c for Craps, P or p for Pick a card: ");
            //promptinig the user to enter their varible
            if (myScanner.hasNextLine()){
                //if statement asking if the user entered a correct string varible
                String answer =myScanner.nextLine();
                    //identifying for a sting and delcaring
                    if (answer.equals("R")||(answer.equals("r"))){
                        //if statement for the roulette game
                        int randomNumber=(int)(Math.random()*38)+1;
                            //declaring the suit
                        String rouletteCard="";
                                //srting for the roulette card
                            if (randomNumber>=1&&randomNumber<=36){
                                System.out.println("Roulette: " +(randomNumber));
                                    //printing the default numbers for the roulette game
                            }   //close the if statement
                            else if (randomNumber==37){
                                System.out.println ("Roulette: 0");
                            }   //end the else statement
                            else if (randomNumber==38){
                                System.out.println("Roulette: 00");
                            }   //end the else statement
                      
                    }   //end the if statement
                    if (answer.equals("C")||(answer.equals("c"))){
                        //else if statement for the craps game
                        System.out.println("Card and answer not implemented yet");
                            //print statement giving the craps outcome
                    }   //end the if statement
                    if (answer.equals("P")||(answer.equals("p"))){
                        //else if statement for the pick a card game
                        System.out.println("Card and answer not implemented yet");
                            //print statement for the picking the card outcome
                    }   //end the if statement
            }   //end the if statement
            
            else{   //else statement for if the person doesn't enter the proper varible
                System.out.println("You did not enter a R, r, C, c, P, or p");
                    //print statement saying you did not enter a correct varibl
                return;
                    //terminate the program
            }   //end the else statement
            
        }   //end the main method
}   //end the class