package ASCII;

import java.util.Scanner;

public class Char_value {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				Scanner input = new Scanner(System.in);
				System.out.println("Enter a ASCII Value : ");
				int in=input.nextInt();
				System.out.println("Character Value of \'"+in+"\' : "+getChar(in));
				input.close();
			}
			
			static char getChar(int a) {
				return (char) a;
			}
	
}
