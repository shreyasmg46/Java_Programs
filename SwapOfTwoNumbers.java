package BasicProgramsofJava;

import java.util.Scanner;

public class SwapOfTwoNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First Number");
		int num1 = sc.nextInt();
		System.out.println("Enter the Second Number");
		int num2 = sc.nextInt();
		int res=num1;
		num1=num2;
		num2= res;
		System.out.println("The Swap of two numbers is " + num1 + num2);
		sc.close();
	}
}
