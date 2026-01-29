package PST;
import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a String :");
		String a = in.nextLine();
		a.toLowerCase(); 
		String b="";
		for(int i=a.length()-1;i>=0;i--) {
			b+=a.charAt(i);
		}
		if (a.equals(b)) 
			System.out.println(a+" is a Palindrome.");		
		else
			System.out.println(a+" is not a Palindrome");			
		in.close();
	}

}
