package String;

import java.util.Scanner;

public class Remove_duplicate {

	public static void main(String[] args) {
		// TODO remove the duplicate characters in string
		Scanner input = new Scanner(System.in);
		String str1,temp;
		System.out.println("Enter a String : ");
		str1=input.next();
		temp="";
		input.close();
		for(int i=0;i<str1.length();i++) {
			if(in(str1.charAt(i),temp)==false){
				temp+=str1.charAt(i);
			}
		}
		System.out.println("\nString after removing Duplicates : "+temp);
	}
	static boolean in(char  a, String b) {
		for(int i=0;i<b.length();i++) {
			if(b.charAt(i)==a)
				return true;			
		}
		return false;
	}
}
