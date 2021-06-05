
import java.util.Scanner;

public class Employee implements AmountTax {						// 2.5 Interface										
	
	//final double taxAmount=0.1;
	Scanner sc = new Scanner(System.in);				
	
	 private String name,shift;
	 private int StaffID;
	 private double salary;
	 
	 
	 Employee(String shift){									
		 this.shift = shift ;
	 }
	 
	 Employee(String name, int StaffID){						
		 
		 this.name = name;
		 this.StaffID = StaffID;
	 }
	 
	 Employee(double TotalNetSalary){			
		 
		 Salary();
		 
		 }
	 	 
	public double  Salary() {										
		
		double MonthlySalary,NumberOfDaysWork,NumberOfDayMonth,TotalSalary;
		double TotalNetSalary;
		
		
		System.out.print("Enter Monthly Salary      : RM ");
		MonthlySalary=sc.nextDouble();
		System.out.print("Enter Number Of Days Work : ");
		NumberOfDaysWork=sc.nextDouble();
		System.out.print("Enter Number Of Day Month : ");
		NumberOfDayMonth=sc.nextDouble();
		TotalSalary=(MonthlySalary*NumberOfDaysWork)/NumberOfDayMonth;
		System.out.printf("Your Total Salary        : RM %.2f \n",TotalSalary);
		TotalNetSalary = TotalSalary - (TotalSalary* getAmountTax());
		System.out.printf("Your TotalNetSalary      : RM%.2f ",TotalNetSalary);
		return TotalNetSalary;
				
			}
	
	public void printInfo() {															// 2.2 Polymortism
		System.out.println("\t~~~~~ END OF STAFF SALARY SECTION ~~~~~");
	}

	 public double getAmountTax() {
		 	return 0.1;
	 }

	 public String getName() {
	        return this.name;
	    }
 
	 public Integer getStaffID() {
	        return this.StaffID;
	    }

	 public double getSalary() {
	        return this.salary;
	    }
	 
	 public String getShift() {
		 return this.shift;
	 }
}        