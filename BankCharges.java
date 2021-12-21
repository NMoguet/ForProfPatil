import java.util.Scanner;

/*
 A bank charges a base fee of $10 per month, plus the following check fees for a commercial checking account:
 $.10 each for less than 20 checks
 $.08 each for 20–39 checks
 $.06 each for 40–59 checks
 $.04 each for 60 or more checks
 Write a program that asks for the number of checks written for the month. The program should then calculate and display the bank’s service fees for the month.Á
 */


public class BankCharges {
	static int basefee = 10;
	static double checkfee = 0;
	static int checks = 0;
	static double total = 0;
	
	static Scanner get = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Please enter the number of checks written this month: ");
		checks = get.nextInt();
		
	if (checks < 20) {
		checkfee = .10;
		total = basefee + (checks * checkfee);
		System.out.println("This month's service fees are $" + total);
	}
	
	if (checks > 19 && checks < 40) {
		checkfee = .08;
		System.out.println("This month's service fees are $" + total);
	}
	
	if (checks > 39 && checks < 60) {
		checkfee = .06;
		System.out.println("This month's service fees are $" + total);
	}
	
	if (checks > 59) {
		checkfee = .04;
		System.out.println("This month's service fees are $" + total);
	}

	}

}
