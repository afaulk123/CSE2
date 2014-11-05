//Ashley Faulkner
//Homework 9
//the purpose of this lab is to write a method that prints a block of numbers given an input

import java.util.Scanner;
    //import the scanner data
    public class BlockedAgain{  
            //call the class of the program
        public static void main(String []s){
            //declare the main method
        int m;
            //force user to enter int in range 1-9, inclusive.
        m = getInt(); 
            //define the variable m
        //allBlocks(m);
            //call the instruction
        }   //end the main method
    public static int getInt(){
       Scanner scan= new Scanner(System.in);
       int a = 0;
       boolean b = checkInt(scan);
       if (b== true){
          a = scan.nextInt();
       }
       else {
           System.out.println("You didn't enter an integer");
           //Scanner x = new Scanner(System.in);
           a = getInt();
       }
       return a;
    }
    public static boolean checkInt(Scanner scan){
        if (scan.hasNextInt()){
        return true;
        }
        else{
            return false;
        }
        
    }
    public static int checkRange(int m){
        if (m<=9 && m>=1){
        //return m;
        }
        else{ System.out.println("you did not return an int");
        //Scanner c = new Scanner(System.in);
        m=getInt();
        }
        return m;
    }
    //public static allBlocks(int x){
        
    //}
    //public static block(){
        
    //}
    //public static line(){
        
    //}

}   //end the class
