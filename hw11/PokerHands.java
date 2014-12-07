import java.util.Scanner;
public class PokerHands{
    public static void main(String [] args){
System.out.println("Enter a 'y' or 'Y' to enter a(nother) hand: ");
    if (answer.equals("y")||(answer.equals("Y"))){
        //else if statement for the pick a card game
    System.out.println("Enter the suit: 'c', 'd', 'h', 's': "); 
        //print statement for the picking the card outcome
        }   //end the if statement
    }
public static void showOneHand(int hand[]){
	String suit[]={"Clubs:	", "Diamonds: ", "Hearts:   ", "Spades:   "};
	String face[]={
       "A ","K ","Q ","J ","10 ","9 ","8 ","7 ","6 ","5 ",
  	"4 ","3 ","2 "};
	String out="";
	for(int s=0;s<4;s++){
  	out+=suit[s];
  	for(int rank=0;rank<13;rank++)
    	for(int card=0;card<5;card++)
     	if(hand[card]/13==s && hand[card]%13==rank)
      	out+=face[rank];
  	out+='\n';
	}
	System.out.println(out);
  }
}
