package lab2;

import java.util.Scanner;

public class Ladder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter no. of rows");
		int a=scan.nextInt();
		for(int i=1;i<=a;i++) {
			for (int j=1;j<=i;j++) 
				System.out.print(j);
					for (int k=i-1;k>=i;k--)
						System.out.print(k);
							System.out.print("\n");
							scan.close();
			
		}

	}

}
