package Lab3;
import java.util.Scanner;

public class Lab3NumberRange {

	public static void main(String[] args) {
	Scanner scnr = new Scanner(System.in);

	String userName;
	long userNum;
	String userChoice = null;
	
	System.out.println("Hi There! What's your name?");
	userName = scnr.nextLine();
	
	
	
		
	do {
	System.out.println("OK, " + userName + ". Please enter a number between 1 - 100.");
	userNum = scnr.nextLong();
		
	
		if ((userNum < 60) && (userNum %2) != 0) { 
		System.out.println(userNum + " Odd");
	} else if ((userNum > 1) && (userNum < 26) && (userNum % 2) ==0) {
		System.out.println("Even and less than 25");
	} else if ((userNum > 25) && (userNum < 61) && (userNum % 2) == 0) {
		System.out.println("Even");
	} else if ((userNum > 60) && (userNum < 101) && (userNum % 2) == 0) {
		System.out.println(userNum + " Even");
	} else if ((userNum > 60) && (userNum < 101) && (userNum % 2) != 0) {
		System.out.println("Odd and over 60");
	} else if ((userNum < 0) || (userNum > 100)) {
		System.out.println("Not so great at following directions, huh " + userName + "?");
	}
	
	System.out.println("Would you like to try again? (y/n)");
	userChoice = scnr.next();
		
	}  while (userChoice.equals ("y") || userChoice.equals ("Y"));
	
	System.out.println("Ok, goodbye!");
	
	scnr.close();
}
	
	

	}




