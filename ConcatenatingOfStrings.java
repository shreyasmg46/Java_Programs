package BasicProgramsofJava;

import java.util.Scanner;

public class ConcatenatingOfStrings {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First Statement");
		String str1 = sc.nextLine();
		System.out.println("Enter the Second Statement");
		String str2 = sc.nextLine();
		if(str1.isEmpty() && str2.isEmpty()){
			System.out.println("Invalid Statements");
		}else
		{
		String str3 = str1 + str2;
		System.out.println("The statements are " + str3);
		}
		sc.close();
	}

}
