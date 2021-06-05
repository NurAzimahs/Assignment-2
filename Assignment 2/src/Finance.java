import java.util.Scanner;
public class Finance {

	Scanner sc = new Scanner(System.in);
	
	private String WorkerOnDuty,gender,position;
	private double Cost,profit;
	 
	 
	Finance(String position){									
		this.position = position ;
	}
	
	
	 Finance(String WorkerOnDuty, String gender){				
		 
		 this.WorkerOnDuty = WorkerOnDuty;
		 this.gender = gender;
	 }
	 
	 Finance(){								   								
		 
		 }
	 	 
	public double Profit() {										
		
		double TotalCost,bill,facilities,AdvertisingCost,sales,wages,Totalwages;
			
		
		System.out.print("Company Bill Cost               : RM ");
		bill = sc.nextDouble();
		System.out.print("Company Facilities Cost         : RM ");
		facilities = sc.nextDouble();
		System.out.print("Company Advertising Cost        : RM ");
		AdvertisingCost=sc.nextDouble();
		System.out.print("Manager's Salary                : RM ");
		wages = sc.nextDouble();
		Totalwages = wages*5;
		System.out.println("Manager's Salary for 5 Branch : " + Totalwages);
		TotalCost=bill+facilities+AdvertisingCost+Totalwages;
		System.out.println("Total operating cost          : RM " + TotalCost);
		System.out.print("Company Sales for a month       : RM ");
		sales = sc.nextDouble();
		profit = sales - TotalCost ;
		//ProfitLoss();
		
		if(sales-TotalCost>0){
			System.out.println("Total Profit this Month   : RM " + (sales-TotalCost));
        } 
		else if(sales-TotalCost<0){
			System.out.println("Total Loss this Month     : RM " + (sales-TotalCost));
        } 
		return profit;
	}

	public void printInfo() {													// 2.2 Polymortism
		System.out.println("\t~~~~~ END OF FINANCIAL SECTION ~~~~~");
	}
	 
	 public String getWorkerOnDuty() {
	        return this.WorkerOnDuty;
	    }

	 public String getGender() {
	        return this.gender;
	    }

	 public double getCost() {
	        return this.Cost;
	    }
	 

	 public String getPosition() {
		 return this.position;
	 }
}

