package String;
import java.util.Scanner;
public class Frequent_char {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String var=input.next();
		String temp="";
		char[] characters = new char[var.length()];
		int[] counts=new int[var.length()];
		int count=0;
		int index=0;
		int high=0;
		for (int i=0;i<var.length();i++) {
			if(!in(var.charAt(i),temp)) {
				temp+=var.charAt(i);
				count=0;
				characters[index]=var.charAt(i);
				for(int j=0;j<var.length();j++) {
					if(var.charAt(i)==var.charAt(j)) {
						count++;
					}
				}
				counts[index]=count;
				index++;
			}
			
		}
		
		for (int i=0;i<counts.length;i++) {
			if(counts[high]<counts[i])
				high=i;
		}
		System.out.println("The frequent character in the String is :\""+characters[high]+"\" with count "+counts[high]);
		input.close();
	}
	static boolean in(char  a, String b) {
		for(int i=0;i<b.length();i++) {
			if(b.charAt(i)==a)
				return true;			
		}
		return false;
	}
}
