package BasicProgramsofJava;

import java.util.Scanner;

public class PalindromeOfString {

	public static void main(String[] args) {
		String original, reverse = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Word");
		original = sc.nextLine();
		int length = original.length();
		if(original.isEmpty()){
			System.out.println("Invalid Word");
		}else{
		for(int i=length-1; i>=0; i--)
			reverse = reverse + original.charAt(i);
		if(original.equals(reverse))
			System.out.println("Its a Palindrome");
		else
			System.out.println("Its not a Palindrome");
		}
		sc.close();
	}
}
