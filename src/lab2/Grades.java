package lab2;

import java.util.Scanner;

public class Grades {
	public static void main(String[] args) {
		double grade;
		double sumofgrade;
		int students;
		int pass;
		int fail;
		fail=0;
		pass=0;
		students=0;
		sumofgrade=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("\nGrade processing Program\n");
		System.out.println("Enter 1st student's garde:");
		grade=scan.nextDouble();
		while (grade>=0) {
			sumofgrade=sumofgrade+grade;
			students=students+1;
			if(grade<60) 
				{fail=fail+1;}
			else
				{pass=pass+1;}
			
			System.out.println("Enter Next Student's grade(put-ve for quit):");
			grade=scan.nextDouble();}
			if(students>0) {
				System.out.println("Grade Summary:\n");
				System.out.println("Grade Average: "+sumofgrade/students);
				System.out.println("Passing Students: "+pass);
				System.out.println("Failed students: "+fail);
			}else {System.out.println("...No Grades Processed....");}
			scan.close();}
	}
