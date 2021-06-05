import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 											
		int choice;
		
		System.out.println("\t*** HOTEL DESCRIPTION ***");
		 System.out.println();
		 EventDescription e = new EventDescription();															
		 e.setHotelName("Twilight Hotel");
		 e.setLocation("No16, Mentari Road, Pantai Chenang Langkawi, Kedah");
		 e.setPosscode("07000");
		 e.setTelNumber("03-3287640");
		 e.setWebsite("www.twilighthotel.com.my");
		 e.setRating(4.5);
		 
		 System.out.println("Hotel Name     : " + e.getHotelName());
		 System.out.println("Location       : " + e.getLocation());
		 System.out.println("Poscode        : " + e.getPosscode());
		 System.out.println("Office Number  : " + e.getTelNumber());
		 System.out.println("Website        : " + e.getWebsite());
		 System.out.println("Hotel Rating   : " + e.getRating() + " Star");
		 System.out.println();
		
		 System.out.println("\t>> 1 : Admin <<\n" 
				 			+ "\t>> 2 : User  <<\n"
		 					+ "\t>> 3 : Exit  <<");
		 System.out.println();
		 System.out.print("Login as : ");
		 choice = sc.nextInt();
		 
		 if(choice == 1) {
			 System.out.println();
			 System.out.println("\t*** STAFF SALARY SECTION ***");
			 System.out.println();
			 Employee b = new Employee("Miss Shamira",280405);							
			 Employee b2 = new Employee("Night");										
			 System.out.println("Name        : " + b.getName());
			 System.out.println("Employee ID : " + b.getStaffID());
			 System.out.println("Shift       : " + b2.getShift());
			 System.out.println();
			 b.Salary();
			 System.out.println();
			 b.printInfo();
			 
			 System.out.println();
			 System.out.println("\t*** FINANCIAL SECTION ***");
			 System.out.println();
			 Finance c = new Finance("Mr. Azizul","male");								
			 Finance c2 = new Finance("Accountant");									
			 System.out.println("Name Staff On Duty : " + c.getWorkerOnDuty());
			 System.out.println("Gender             : " + c.getGender());
			 System.out.println("Position           : " + c2.getPosition());
			 System.out.println();
			 c.Profit();
			 System.out.println();
			 c.printInfo();
		 }
		 
		 else if(choice == 2) {
			 System.out.println();
			 System.out.println("\t*** CUSTOMER PERSONAL INFORMATION ***");
			 System.out.println();
			 CustomerRegistration a = new CustomerRegistration();						
			 System.out.println();
			 System.out.println("");
			 System.out.println("Name        : " + a.CustName());
			 System.out.println("Ic/Passport : " + a.IcOrPassport());
			 System.out.println("No. Phone   : " + a.contactNumber());
			 System.out.println();
			 a.printCode();
		     System.out.println();
		     a.typeOfPromotion();
		     System.out.println();
		     a.printInfo();
													
			 
			 
		 }
		 else if(choice == 3) {
			 System.out.println("\t+++++++ THANK YOU ++++++");
		 }
		 
		 System.out.println("Do You want to Proceed or Exit");
		 System.out.println();
		 System.out.println("\t>> 1 : Admin <<\n" 
		 			+ "\t>> 2 : User  <<\n"
					+ "\t>> 3 : Exit  <<");
		 System.out.println();
		 System.out.println("Choose : ");
		 choice = sc.nextInt();
	}
	}