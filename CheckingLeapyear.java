package BasicProgramsofJava;

import java.util.Scanner;

public class CheckingLeapyear {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Year");
		int year = sc.nextInt();
		if(year < 0){
			System.out.println("Invalid Year");
		}
		else if((year % 4) == 0){
			System.out.println("Its a Leap Year");
		}
		else
		{
			System.out.println("Its not a Leap Year");
		}
		sc.close();
	}

}
