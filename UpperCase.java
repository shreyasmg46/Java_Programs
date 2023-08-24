package BasicProgramsofJava;

import java.util.Scanner;

public class UpperCase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the word");
		String str = sc.nextLine();
		String strupp = str.toUpperCase();
		System.out.println("The Upper case of the word is " + strupp);
		sc.close();
	}

}
