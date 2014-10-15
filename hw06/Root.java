//Ashley Faulkner
//HW 06 Root
//the purpose of this homework is to find the square root of an number given by the user, using a different method than before
import java.util.Scanner;
public class Root{
    public static void main (String [] args){
    Scanner myScanner;
    myScanner=new Scanner(System.in);
    System.out.print("enter an integer");
    double nRoot= myScanner.nextDouble();
    double nLow=0;
    double nHigh=nRoot+1;
    double nMiddle=0;
       while ((nHigh-nLow)>(.0000001*(1+nRoot))){  
              nMiddle=(nHigh+nLow)/2;
        if ((nMiddle*nMiddle)>nRoot){
            nHigh=nMiddle;
        }   //end if statement
        else{
            nLow=nMiddle;
        }   //end else statement
    }   //end the while
     System.out.println("the square root is : " +nMiddle);

    }   //end main method

}   //end class

