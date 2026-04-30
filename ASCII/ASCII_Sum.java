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
https://chatgpt.com/share/69f05bc3-e914-8321-904c-ceb270304170

https://chatgpt.com/share/69f2fb8e-9c2c-8320-9ef4-062ac248b973
