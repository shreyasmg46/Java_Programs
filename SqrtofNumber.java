package BasicProgramsofJava;

import java.util.Scanner;

public class SqrtofNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num = sc.nextInt();
		if(num < 0){
			System.out.println("Invalid Number");
		}else{
		double sqrt = Math.sqrt(num);
		System.out.println("The Square root of the number is " + sqrt);
		}
		sc.close();
	}

}
