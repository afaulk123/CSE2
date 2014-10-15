//Ashley Faulkner
//HW 06 Roulette
//the purpose of this homework is to find the total winnngs of a man who thinks he can beat the Roulette table

import java.util.Scanner;   //import scanner data
public class Roulette{  //declare the class
    public static void main (String [] args){   //declare the main method
    int nPlays=1;
    int nGame=1;
    int randomNumber1=0;
    int randomNumber2=0;
    int nWinsPerSession=0;
    int nLossesPerSession=0;
    int nLossesTotal=0;
    int nWinsTotal=0;
    int nWinsPerTrial=0;
    Scanner myScanner;  //declaring the scanner
    myScanner=new Scanner(System.in);   //creating the scanner a varible
        
        randomNumber1=(int)(Math.random()*38)+1;
                            //declaring the suit
            String rouletteCard="";
                //srting for the roulette card
            if (randomNumber1>=1&&randomNumber1<=36){
                System.out.println("Roulette Bet: " +(randomNumber1));
                    //printing the default numbers for the roulette game
            }   //close the if statement
            else if (randomNumber1==37){
                System.out.println ("Roulette Bet: 0");
            }   //end the else statement
            else if (randomNumber1==38){
                System.out.println("Roulette Bet: 00");
            }   //end the else statement
        while (nPlays<=1000){
     
            while (nGame<=100){
                randomNumber2=(int)(Math.random()*38)+1;
                    //declaring the suit
                   
                if (randomNumber2==randomNumber1){ //if the number bet on is the same as the randomly generated one
                    nWinsPerSession++;
                    nWinsPerTrial++;
                }   //end the if statement 
                //else {  //if the number bet on isn't the same as the one that is randomly generated
                  //  nLossesPerSession++; 
                //}   //end the else statement
                nGame++;
            }   //end nested while loop
            
            if (nWinsPerSession>=3){ //if you win more than three times
                nWinsTotal++;
            }   //end the if
            if (nWinsPerSession==0){ //if you never win at all
                nLossesTotal++;
            }   //end the if statement
        nWinsPerSession=0;
        nPlays=nPlays+1;

        }   //end first while loop  
        
        //winnings=(nWinsTotal*randomNumber1);  //total winnings in dollars
        //System.out.println("Number of times you win per session :" +nWinsPerSession);   //print number of wins
        //System.out.println("Number of times you lose per session :" +nLossesPerSession);    //print number of losses
        //if (nWinsPerSession>randomNumber1){
          //  System.out.println("You come away with a profit in one session");  //print that you are profitable
        //}   //end the if statement
        //else{   //else statement if the number of wins per session is not greater than the random number generated
          //  System.out.println("You are not profitable in one session");   //prints that you are not profitable
        //}   //end the else statement
        System.out.println("Number of total losses: " +nLossesTotal);
        System.out.println("Number of total wins: " +nWinsPerTrial);   //print total number of wins
        System.out.println("The total times you come away with profit " +nWinsTotal);   //print winnings
        

    }   //end main method
}   //end class