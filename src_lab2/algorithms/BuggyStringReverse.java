package algorithms;

import java.util.Scanner;

public class BuggyStringReverse {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);

		String s;

		System.out.println("\n Please enter a String to reverse: ");
		s = stdin.next();

		stdin.close();
		System.out.println("The reverse of \"" + s + "\" is " + reverseString(s));

	}

	public static String reverseString(String s) {

		// initiate vars
		String rev = "";

		//solution: use index  i in the for loop to process the string
		//Remember there's more than 1 solution!
		for (int i = 1; i <= s.length(); i++) {   // start at one
			rev += s.charAt(s.length() - i); 	
		}
		return rev;
	}

}