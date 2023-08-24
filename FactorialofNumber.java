package BasicProgramsofJava;

import java.util.Scanner;

public class FactorialofNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num = sc.nextInt();
		int res =1;
		if(num < 0){
			System.out.println("Invalid Number");
		}else
		{
			for(int i=1;i<=num;i++){
				res = res * i;
			}
			System.out.println("The Factorial of the number is " + res);
		}
		sc.close();
	}
}
