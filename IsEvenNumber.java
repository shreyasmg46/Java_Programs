package BasicProgramsofJava;

import java.util.Scanner;

public class IsEvenNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num = sc.nextInt();
		if(num < 0){
			System.out.println("Invalid Number");
		}else if((num%2) == 0)
		{
			System.out.println("It's a Even Number");
		}else
		{
			System.out.println("it's a Odd Number");
		}
		sc.close();
	}

}
