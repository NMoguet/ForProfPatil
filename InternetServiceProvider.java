import java.util.Scanner;

class InternetServiceProvider {
  public static void main(String[] args) {

/*
Package A: For $9.95 per month 10 hours of access are provided. Additional hours are $2.00 per hour. Package B: For $13.95 per month 20 hours of access are provided. Additional hours are $1.00 per hour. Package C: For $19.95 per month unlimited access is provided.
*/

char pkg;
double baserate = 0;
double basehours = 0;
double hours = 0;
double total = 0;
double addhours = 0;

Scanner input = new Scanner(System.in);

System.out.println("Enter the letter of the package purchased: ");
pkg = input.next().charAt(0);

switch (pkg) {
  case 'a':
  case 'A':
  baserate = 9.95;
  basehours = 10;
  addhours = 2.00;
break;

  case 'b':
  case 'B':
  baserate = 13.95;
  basehours = 20;
  addhours = 1.00;
break;

  case 'c':
  case 'C':
  System.out.println("Enter the number of hours that were used: ");
  System.out.print("Your total charges are $9.95");
  System.exit(0);

  default:
  System.out.println("Enter the number of hours that were used: ");
  System.out.println("That package input was not an option.");
   System.exit(0);
break;
}


System.out.println("Enter the number of hours that were used: ");
hours = input.nextDouble();

if (hours <= basehours) {
  total = baserate;
} else {
  total = (((hours - basehours) * addhours) + baserate);
}

System.out.print("Your total charges are " + total);

  }
}