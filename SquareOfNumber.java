package BasicProgramsofJava;

import java.util.Scanner;

public class SquareOfNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num = sc.nextInt();
		int square = (num*num);
		System.out.println("The Square of the Number is " + square);
		sc.close();
	}
}
