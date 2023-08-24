package BasicProgramsofJava;

import java.util.Scanner;

public class SumOfNumbers {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num = sc.nextInt();
		int sum = 0;
		if(num < 0){
			System.out.println("Invalid Number");
		}else{
			while(num>0){
			sum = (sum + (num % 10));
			num = num / 10;
			}
			System.out.println("The Sum of Numbers is " + sum);
		}
		sc.close();
	}
}
