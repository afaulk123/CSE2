////////////////////////////////////////////////////////////////////////////////
//Ashley Faulkner
//September 17th, 2014
//Lab 04
//Big Mac Again Java Program

//The purpose of this lab is given user imputs, output the number of Big Macs ordered, if the customer wants fries (if so, how many) and calculate the total cost for the meal
    //First, write the code
    //Second, compile the code
    //Third, run the code
    //Fourth, upload to Github
    
    import java.util.Scanner;
        //importing the data from the java scanner
     
        
    //Define the class
    public class BigMacAgain{
        //define the main method
        public static void main (String [] args){
            
        //input the data
            Scanner myScanner;  
                //declaring the scanner an object
            myScanner= new Scanner(System.in); 
                //call the scanner a constructor
            int nBigMacs=0;
                //declaring big macs
            System.out.print("enter the number of Big Macs: ");
                //prompting the user to enter the number of big macs they want to order
    
                if (myScanner.hasNextInt()){   
                    //if statement asking if the user used a positive integer
                    nBigMacs=myScanner.nextInt();
                        //declaring big mac value
                    if (nBigMacs<0){
                        //if the number of big macs entered is less than zero
                        System.out.println("You did not enter an int > 0");
                            //system prints the fact that you didn't enter a value greater than zero
                        return;     //terminates the program
                    }   //end the if statement
                
                    //
                System.out.println("You ordered "+(nBigMacs)+ "for a cost of "+(nBigMacs)+" X $2.22 = "+(nBigMacs*2.22));   
                    //printing how many big macs the customer wants, the price and the total cost of the burgers
                
                }   //end the if statement
                else{   
                        //else statement if no positive integer is entered
                    System.out.println("You did not enter an int"); 
                        //the user didn't answer with a positive integer
                    return; 
                        //leaves and terminates the program
                }   //end the else statement
                
            System.out.print("Do you want an order of fries (Y/y/N/n): ");
                    //asking the user if they want fries with their burger
                    
                   String answer = myScanner.next();
                    if (answer.equals("Y")||answer.equals("y")){
                    System.out.println("You ordered fries at the cost of $2.15");
                        //print that you want fries with the meal
                    System.out.println("The total cost of your meal is $" +(nBigMacs*2.22));
                        //user wants fries, so you print the price of meal plus fries
                    }   //end the if statement
                    else if (answer.equals("N")||answer.equals("n")){
                        //user doesn't want fries
                        System.out.println("The total cost of your meal is $ "+(nBigMacs*2.22));
                            //printing the value of the meal without fries
                    }   //end the else if statement
                
                else{   //else statment for if the user doesnt enter a Y, N, y, n
                    System.out.println("You did not enter a proper yes or no"); 
                        //the user didn't anser a proper varible
                    return;     
                        //terminates the program
                    }   //ends the else statement
            
        
        }   //end main methoid
    }   //end class
    