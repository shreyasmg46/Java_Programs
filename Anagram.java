package BasicProgramsofJava;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First Word");
		String str1 = sc.nextLine();
		System.out.println("Enter the Second Word");
		String str2 =sc .nextLine();
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		if(str1.length() != str2.length()){
			System.out.println("Its not a Anagram");
		}else
		{
			char[] string1 = str1.toCharArray();
			char[] string2 = str2.toCharArray();
			
			Arrays.sort(string1);
			Arrays.sort(string2);
			
			if(Arrays.equals(string1, string2) == true){
				System.out.println("Its an anagram");
			}else
			{
				System.out.println("Its not an anagram");
			}
		}
		sc.close();
	}
}
