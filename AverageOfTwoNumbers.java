package BasicProgramsofJava;

import java.util.Scanner;

public class AverageOfTwoNumbers {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First Number");
		int a = sc.nextInt();
		System.out.println("Enter the Second Number");
		int b = sc.nextInt();
		if(a<0 || b<0){
			System.out.println("Invalid Average");
		}
		else
		{
		int c = ((a+b)/2);
		System.out.println("The Average of Two Numbers is " + c);
		sc.close();
		}
	}

}
