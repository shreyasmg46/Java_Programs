package BasicProgramsofJava;

import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		boolean found = false;
		System.out.println("Enter the Number");
		int num = sc.nextInt();
		if(num<=0){
			System.out.println("It's not a Prime Number");
		}else
		{
			for(int i=2;i<=num/2;i++){
				if(num % i == 0){
					found = true;
					break;
				}
			}
			if(!found){
				System.out.println("Its a Prime Number");
			}else
			{
				System.out.println("Its not a Prime Number");
			}
		}
		sc.close();
	}
}
