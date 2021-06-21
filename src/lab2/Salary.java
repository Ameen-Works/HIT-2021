package lab2;

import java.text.NumberFormat;
import java.util.Scanner;

public class Salary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double currentSalary;
		double raise;
		double newSalary;
		String rating;
		Scanner scan=new Scanner(System.in);
		System.out.println("Employee's current salary: ");
		currentSalary=scan.nextDouble();
		System.out.println("Employee's Rating:(Excellent,Good,Poor)");
		rating=scan.next();
			if(rating.equalsIgnoreCase("Excellent")) {
		
			raise=.06*currentSalary;
		}else if (rating.equalsIgnoreCase("good")) {
				
			raise=.04*currentSalary;
		}else {
			raise=.015*currentSalary;
			
		}
		newSalary=currentSalary+raise;
		NumberFormat money=NumberFormat.getCurrencyInstance();
		System.out.println();
		System.out.println("Current Salary: "+money.format(currentSalary));
		System.out.println("Amount to be raised: "+money.format(raise));
		System.out.println("New Salary: "+money.format(newSalary));
		scan.close();

	}

}
