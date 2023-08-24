package BasicProgramsofJava;

import java.util.Scanner;

public class PalindromeOfNumber {

	public static void main(String[] args) {
		String original, reverse="";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		original = sc.nextLine();
		int length = original.length();
		for(int i=length-1; i>=0; i--)
			reverse = reverse + original.charAt(i);
			if(original.equals(reverse))
				System.out.println("Its a Palindrome");
			else
				System.out.println("Its not a Palindrome");
		sc.close();
	}

}
