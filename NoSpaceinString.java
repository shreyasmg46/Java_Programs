package BasicProgramsofJava;

import java.util.Scanner;

public class NoSpaceinString {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the String");
	String str = sc.nextLine();
	String noSpace = str.replaceAll("\\s", "");
	System.out.println(noSpace);
	sc.close();
	}
}
