//Ashley Faulkner
//Homwwork 10 part 1
//11-17-2014

import java.util.Scanner;
    //import scanner data
public class FindDuplicates{
    //declare class of duplicates
    public static void main(String [] arg){
            //declare main class
    Scanner scan=new Scanner(System.in);
        //call the scanner
    int num[]=new int[10];
        //enter an arry
    String answer="";
        //declare a string
    do{
        //declare do while loop
      System.out.print("Enter 10 ints- ");  
        //propmt user to enter 10 integers
      for(int j=0;j<10;j++){
            //start for statement
        num[j]=scan.nextInt();
            //declarte array
      } //end the for loop
      String out="The array ";
        //prin thte string "the array"
      out+=listArray(num); //return a string of the form "{2, 3, -9}"   
      if(hasDups(num)){
          //if 
        out+="has ";
            //print the out varible
      } //end the if statement
      else{
        //else statement
        out+="does not have ";
            //print that it doesn't have 
      } //end the else statement
      out+="duplicates.";
        //print duplicates
      System.out.println(out);
        //print out
      out="The array ";
        //state the array
      out+=listArray(num);   
        //call the array
      if(exactlyOneDup(num)){
          //call the OneDuplicate method
        out+="has ";
      } //end the if statement
      else{
        out+="does not have ";
      }
      out+="exactly one duplicate.";
    System.out.println(out);
        //print the return value
    System.out.print("Go again? Enter 'y' or 'Y', anything else to quit- ");
        //prompt the user to enter or quit the program
        answer=scan.next();
            //if the data fits the parameters
    }while(answer.equals("Y") || answer.equals("y"));
        //end the dowhile loop
} //end the main method
    
    public static boolean exactlyOneDup(){
        String name = "Exactly One Duplicate";
            //name the array
        for (int i=0, i<10, i++){
            for (int a=0, a<10, a++){
                if (x[i]== x[a]){
                match ++;
            }   //end the for loop
            if (match == 1){
                return true;
                // return that the value is true and only has one duplicate
            }   //end if statement
            else{
                return false;
            }   //end the else statement
        }   //end the for loop
    }   //end exactlyOneDup Method
    
    public static boolean hasDups(){
            //method for the the multiple duplicates
        String name = "More than One Duplicate";
            //name the array
        for (int i=0, i<10, i++){
            for (int a=0, a<10, a++){
                if (x[i]== x[a]){
                match ++;
            }   //end the for loop
            if (match > 1){
                return true;
                // return that the value is true and only has one duplicate
            }   //end if statement
            else{
                return false;
            }   //end the else statement
        }   //end the for loop
    }   //end hasDups method
    
    public static String listArray(int num[]){
      //create the listArray method
    String out="{";
    for(int j=0;j<num.length;j++){
        //call the for loop
        if(j>0){
            //parameter for the if statement
            out+=", ";
        } //end the if statement
        out+=num[j];
    }
    out+="} ";
    return out;
        //return the output
  } //end the listArray method
}   //end the class
