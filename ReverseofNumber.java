package BasicProgramsofJava;

import java.util.Scanner;

public class ReverseofNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num = sc.nextInt();
		int reverse = 0;
		while(num > 0){
			int reminder = num % 10;
			reverse = (reverse * 10) + reminder;
			num = num / 10;
		}
		System.out.println("The Reverse of the Number is " + reverse);
		sc.close();

	}

}
