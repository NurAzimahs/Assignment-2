
import java.util.Scanner;

public class CustomerRegistration extends Promotion {							// answer 2.1 Inheritence 
	 Scanner sc = new Scanner(System.in); 					
	 
	 private String CustName;
	 private int CodePackage;
	 private String IcOrPassport, contactNumber;
	 
	 
	 CustomerRegistration(){									
		 
		 System.out.print("Please insert your name           : ");
		 this.CustName = sc.nextLine();
		 System.out.print("Please insert your IC or Passport : ");
		 this.IcOrPassport = sc.nextLine();
		 System.out.print("Please insert your Contact Number : ");
		 this.contactNumber = sc.nextLine();
		 
	 }
		 void printCode() {									
		 
			 System.out.println("---------- Package Code ----------        ");
			 System.out.println("\tCode 1 : Grand Suite");
			 System.out.println("\tCode 2 : Grand Deluxe");
			 System.out.println("\tCode 3 : Standard Room");
			 System.out.println();
			 
		 System.out.print("Please choose Your Code Package : ");
		 this.CodePackage = sc.nextInt();
		 System.out.println();
			
			switch (CodePackage) {
			
			case 1:
				System.out.println("You are choosing 'Grand Suite'");
				System.out.println("This Package are included : ");
				System.out.println("	Meal for Breakfast, Lunch, Dinner");
				System.out.println("	Free Baucer SPA");
				System.out.println("	Unlimited time for Pool");
				System.out.println("	Unlimited time for Gym\n");
				System.out.println("Total Payment per day : RM3500.00");
				break;
			case 2: 
				System.out.println("You are choosing 'Grand Deluxe'");
				System.out.println("This Package are included : ");
				System.out.println("	Meal for Breakfast, Lunch, Dinner");
				System.out.println("	Unlimited time for Pool");
				System.out.println("	Unlimited time for Gym\n");
				System.out.println("Total Payment per day : RM2000.00");
				break;
			case 3: 
				System.out.println("You are choosing 'Standard Room'");
				System.out.println("This Package are included : ");
				System.out.println("	Unlimited time for Pool");
				System.out.println("	Unlimited time for Gym\n");
				System.out.println("Total Payment per day : RM1000.00");
				break;
			}
		 
	 }
		 public void printInfo() {																	// 2.2 Polymortism
				System.out.println("\t~~~~~ END OF CUSTOMER PERSONAL INFORMATION SECTION ~~~~~");
			}
		 
		 public void typeOfPromotion() {
				super.printPromotion();
			}
	 
	 
	 public String CustName() {
		 return this.CustName;
	 }
	 
	 public Integer CodePackage() {
		 return this.CodePackage;
	 }
	 
	 public String contactNumber() {
		 return this.contactNumber;
	 }
	 
	 public String IcOrPassport() {
		 return this.IcOrPassport;
	 }
}
