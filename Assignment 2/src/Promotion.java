
import java.util.Scanner;
public abstract class Promotion {					// 2.4 Abstraction

	Scanner sc = new Scanner(System.in);	
	
	private int offer;
	
	Promotion(){							
		
	}
	
	void printPromotion() {					
		
		System.out.println("\t----- HOLIDAY PROMOTION -----");
		System.out.println();
		
		System.out.println("You Will Get 50% off ");
		System.out.println();
		System.out.print("Do you want to accept the offer [1 : YES | 2: NO ] ?? : ");
		this.offer = sc.nextInt();
		
		switch (offer) {
		
		case 1:
			System.out.println("Congratulation !! You Accept the promotion.");
			System.out.println("Please use this code for 50% off ");
			System.out.println("** CODE : 9854 **");
			break;
		case 2: 
			System.out.println("You are Reject the Promotion :'( ");
			break;
		}
	}
	public void printInfo() {												// 2.2 Polymortism
		System.out.println("\t~~~~~ END OF PROMOTION SECTION ~~~~~");
	}

}

