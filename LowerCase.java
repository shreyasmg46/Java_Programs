package BasicProgramsofJava;

import java.util.Scanner;

public class LowerCase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the word");
		String str = sc.nextLine();
		String strlow = str.toLowerCase();
		System.out.println("The Lower Case of the Word is " + strlow);
		sc.close();
	}

}
