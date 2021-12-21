import 
import java.util.Scanner;

class InternetServiceProviderPart2 {
	
	static char pkg;
	static double baseratea = 0;
	static double baserateb = 0;
	static double baseratec = 0;
	static double basehoursa = 0;
	static double basehoursb = 0;
	static int hours = 0;
	static double total = 0;
	static double addhours = 0;
	 DecimalFormat Decformatter = new DecimalFormat("#0.00");
	 Decformatter.format(outputvariable));
	 
  public static void main(String[] args) {

/*
Package A: For $9.95 per month 10 hours of access are provided.
Additional hours are $2.00 per hour.
Package B: For $13.95 per month 20 hours of access are provided.
Additional hours are $1.00 per hour.
Package C: For $19.95 per month unlimited access is provided.
*/



Scanner input = new Scanner(System.in);

System.out.println("Enter the letter of the package purchased: ");
pkg = input.next().charAt(0);

switch (pkg) {
  case 'a':
  case 'A':
	  System.out.println("Enter the number of hours that were used: ");
	  hours = input.nextInt();
	  
  baseratea = 9.95;
  basehoursa = 10;
  addhours = 2.00;
  double totalb = 0;
  
  if (hours <= basehoursa) {
	  total = baseratea;
	} else {
	  total = (((hours - basehoursa) * addhours) + baseratea);
	}
  
  baserateb = 13.95;
  basehoursb = 20;
  addhours = 1.00;
  
  if (hours <= basehoursb) {
	  totalb = baserateb;
	} else {
	  totalb = (((hours - basehoursb) * addhours) + baserateb);
	}

  System.out.println("Your total charges are $" + Decformatter.format(total));
  
  	if (totalb < total) {
  		System.out.println("You would have saved $" + Decformatter.format((total - totalb)))(total - totalb) + " if you had gotten package B ");
  	}
	
  	if (19.95 < total) {
  		System.out.println("You would have saved $" + Decformatter.format((total - 19.95)) + " if you had gotten package C ");
  	}
	
	
break;

  case 'b':
  case 'B':
	  System.out.println("Enter the number of hours that were used: ");
	  hours = input.nextInt();
	  
  baserateb = 13.95;
  basehoursb = 20;
  addhours = 1.00;
  
double totala = 0;
  
  if (hours <= basehoursb) {
	  total = baserateb;
	} else {
	  total = (((hours - basehoursb) * addhours) + baserateb);
	}
  
  baseratea = 9.95;
  basehoursa = 10;
  addhours = 2.00;
  
  if (hours <= basehoursa) {
	  totala = baseratea;
	} else {
	  totala = (((hours - basehoursa) * addhours) + baseratea);
	}

  System.out.println("Your total charges are $" + Decformatter.format(total));
  
  	if (totala < total) {
  		System.out.println("You would have saved $" + Decformatter.format((total - totala)) + " if you had gotten package B ");
  	}
	
  	if (19.95 < total) {
  		System.out.println("You would have saved $" + Decformatter.format((total - 19.95)) + " if you had gotten package C ");
  	}
break;

  case 'c':
  case 'C':
	  System.out.println("Enter the number of hours that were used: ");
	  hours = input.nextInt();
	  System.out.println("Your total charges are $9.95");
	  
	  baserateb = 13.95;
	  basehoursb = 20;
	  addhours = 1.00;
	  
	double totalca = 0;
	double totalcb = 0;
	  
	  if (hours <= basehoursb) {
		  totalcb = baserateb;
		} else {
			totalcb = (((hours - basehoursb) * addhours) + baserateb);
		}
	  
	  baseratea = 9.95;
	  basehoursa = 10;
	  addhours = 2.00;
	  
	  if (hours <= basehoursa) {
		  totalca = baseratea;
		} else {
		  totalca = (((hours - basehoursa) * addhours) + baseratea);
		}

	  
	  
	  	if (totalca < 19.95) {
	  		System.out.println("You would have saved $" + Decformatter.format(19.95 - totalca) + " if you had gotten package A ");
	  	}
	  	
	  	if (totalcb < 19.95) {
	  		System.out.println("You would have saved $" + Decformatter.format(19.95 - totalcb) + " if you had gotten package B ");
	  	}
		

	  	
  
  System.exit(0);

  default:
  System.out.println("That package input was not an option.");
   System.exit(0);
break;
}
  }
  }
