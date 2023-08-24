package BasicProgramsofJava;

import java.util.Scanner;

public class ReverseofString {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String Statement");
		String str = sc.nextLine();
		StringBuilder sb = new StringBuilder();
		sb.append(str);
		StringBuilder reverse = sb.reverse();
		System.out.println("The Reverse of String Statement is " + reverse);
		sc.close();
	}

}
