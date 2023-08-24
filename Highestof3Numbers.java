package BasicProgramsofJava;

import java.util.Scanner;

public class Highestof3Numbers {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First Number");
		int num1 = sc.nextInt();
		System.out.println("Enter the Second Number");
		int num2 = sc.nextInt();
		System.out.println("Enter the Third Number");
		int num3 = sc.nextInt();
		if(num1 < 0 && num2 < 0 && num3 < 0){
			System.out.println("Invalid Numbers");
		}else{
		int res1 = Math.max(num1, num2);
		int res2 = Math.max(res1, num3);
		System.out.println("The Highest of the Three Numbers is " + res2);
		}
		sc.close();
	}
}
