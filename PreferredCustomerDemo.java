package cs990_Inheritance_prefCustomer;

import java.util.Scanner;

/*
 A retail store has a preferred customer plan where customers can earn discounts on all their purchases. The amount of a customer’s discount is determined by the amount of the cus-tomer’s cumulative purchases in the store as follows:

• When a preferred customer spends $500, he or she gets a 5 percent discount on all future purchases.

• When a preferred customer spends $1,000, he or she gets a 6 percent discount on all future purchases.

• When a preferred customer spends $1,500, he or she gets a 7 percent discount on all future purchases.

• When a preferred customer spends $2,000 or more, he or she gets a 10 percent dis-count on all future purchases.
 */
public class PreferredCustomerDemo {
	static Scanner get = new Scanner(System.in);
	
	public PreferredCustomerDemo() {
		
	}
	public static void main(String[] args) {
		
		Person per = new Person();
		Customer cus = new Customer();
		
		System.out.println("Enter customer name: ");
		per.setName(get.nextLine());
		System.out.println("Enter customer address: ");
		per.setAddress(get.nextLine());
		System.out.println("Enter customer telephone number: ");
		per.setPhone(get.nextLine());
		System.out.println("Enter CusdID: ");
		cus.setCust(get.nextInt());

//		System.out.println("Cust name: " + per.getName());
//		System.out.println("CustID: " + cus.getCust());
//		System.out.println("Telephone Number: " + per.getPhone());
//		System.out.println("Mail list status: " + cus.mailing);
		
		PreferredCustomer preferredcustomer1 = new PreferredCustomer("John Adams",
		"Los Angeles, CA", "3235331234", 933, true, 400);
		
		System.out.println(preferredcustomer1.toString() + "\n");

		PreferredCustomer preferredcustomer2 = new PreferredCustomer("Susan Adams",
		"Los Angeles, CA", "3235331234", 933, true, 600);
		System.out.println(preferredcustomer2.toString() + "\n");

		PreferredCustomer preferredcustomer3 = new PreferredCustomer("Mary Adams",
		"Los Angeles, CA", "3235331234", 933, true, 1100);
		System.out.println(preferredcustomer3.toString() + "\n");

		PreferredCustomer preferredcustomer4 = new PreferredCustomer("Larry Adams",
		"Los Angeles, CA", "3235331234", 933, true, 1600);
		System.out.println(preferredcustomer4.toString() + "\n");

		PreferredCustomer preferredcustomer5 = new PreferredCustomer("Mony Adams",
		"Los Angeles, CA", "3235331234", 933, true, 2600);
		System.out.println(preferredcustomer5.toString() + "\n");
}
	
	
}

class Person {
	String name;
	String address;
	String phone;
	
	public Person() {
		name = "";
		address = "";
		phone = "";
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
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
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

class PreferredCustomer extends Customer {
	int purch;
	double disc;
	
	public PreferredCustomer(String name, String address, String phone, int custid, boolean mailing, int purch) {
		
	}

			
	public int getPurch() {
		return purch;
	}

	public void setPurch(int purch) {
		this.purch = purch;
	}

	public double getDisc() {
		return disc;
	}

	public void setDisc(double disc) {
		this.disc = disc;
	}
}
