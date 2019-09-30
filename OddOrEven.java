// Author:Jackie Zablah
//Condicional statements to automate the decision - making process.
//includes extended challenges and validation.
package lab3;

import java.util.Scanner;

public class OddOrEven {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		String userChoice = "";
		int userNum = 0;
		String userName = "";
		
		
		System.out.println("Please enter your name:<<");
		userName = scnr.next();
		
		System.out.print(">>Hi " + userName + ", ");

		do {
			System.out.println("Please enter an integer between 1 and 100: <<");
			userNum = scnr.nextInt();
			
			if (userNum <= 0 || userNum > 100) {
				System.out.println(userName + " " + userNum + " is not in the range, Please enter an integer between 1 and 100: <<\n");
			}else if (userNum % 2 != 0 && userNum <= 60) {
				System.out.println(">>"+ userName + ", the integer " + userNum + " is an Odd number.");
			}else if (userNum % 2 != 0 && userNum > 60 && userNum <= 100) {
				System.out.println(">>"+ userName + ", the integer " + userNum + " is an Odd number and over 60.");
			}else if (userNum % 2 == 0 && userNum >= 2 && userNum <= 25) {
				System.out.println(">>"+ userName + ", the integer " + userNum + " is an Even number and less than 25.");
			}else if (userNum % 2 == 0 && userNum >= 26 && userNum <= 60) {
				System.out.println(">>"+ userName + ", the integer " + userNum + " is an Even number.");
			}else if (userNum % 2 == 0 && userNum >= 26 && userNum > 60 && userNum <= 100) {
				System.out.println(">>"+ userName + ", the integer " + userNum + " is an Even number and over 60.");
			}
			 
			
			System.out.println(">> Would you like to continue (y/n)?)");
			userChoice = scnr.next();

			if (userChoice.equalsIgnoreCase("n")) {
				System.out.println(">> Thank you " + userName + ", Goodbye!");
			}

		} while (userChoice.equalsIgnoreCase("y"));
		scnr.close();

	}

}
