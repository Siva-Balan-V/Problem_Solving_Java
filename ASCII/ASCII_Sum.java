package ASCII;

import java.util.Scanner;

public class ASCII_Sum {

	public static void main(String[] args) {
		// TODO Sum of ASCII Values of each characters in String
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String in=input.next();
		int sum=0;
		for (int i=0;i<in.length();i++) {
			sum+=(int)in.charAt(i);
		}
		System.out.println("Sum of ASCII Values of Characters in give String : "+sum);
		input.close();
	}

}
