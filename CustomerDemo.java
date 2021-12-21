import java.util.Scanner;

/*
 * Design a class named Person with fields for holding a person’s name, address, and telephone number. Write one or more constructors and the appropriate mutator and accessor methods for the class’s fields. Next, design a class named Customer, which extends the Person class. The Customer class should have a field for a customer number and a boolean field indicating whether the customer wishes to be on a mailing list. Write one or more constructors and the appropriate mutator and accessor methods for the class’s fields. You can set the default value for Mailing List Status to true. Demonstrate an object of the Customer class in a simple program.
 */
public class CustomerDemo {
	static Scanner get = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		Person per = new Person();
		Customer cus = new Customer();
		
		System.out.println("Enter customer name: ");
		per.setName(get.nextLine());
		System.out.println("Enter customer address: ");
		per.setAddress(get.nextLine());
		System.out.println("Enter customer telephone number: ");
		per.setPhone(get.nextInt());
		System.out.println("Enter CusdID: ");
		cus.setCust(get.nextInt());

		System.out.println("Cust name: " + per.getName());
		System.out.println("CustID: " + cus.getCust());
		System.out.println("Telephone Number: " + per.getPhone());
		System.out.println("Mail list status: " + cus.mailing);
}
}

class Person {
	String name;
	String address;
	int phone;
	
	public Person() {
		name = "";
		address = "";
		phone = 0;
	}
	public String getName() {
		return name;
	}
	public String setName(String name) {
		return this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public String setAddress(String address) {
		return this.address = address;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	} 
}

class Customer extends Person {
		boolean mailing;
		int cust;
		
		public Customer() {
			mailing = true;
			cust = 0;	
		}

		public int getCust() {
			return cust;
		}

		public void setCust(int cust) {
			this.cust = cust;
		}
	}
