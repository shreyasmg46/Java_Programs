package BasicProgramsofJava;

import java.util.Scanner;

public class FibonacciNumber {

	public static void main(String[] args) {
		int a=0,b=0,c=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num = sc.nextInt();
		for(int i=0;i<=num;i++){
		a=b;
		b=c;
		c=a+b;
		System.out.print(a + " ");
		}
		System.out.println();
		System.out.println("The Fibonacci of the number is "+ a);
		sc.close();
	}
}
