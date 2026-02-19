package String;
import java.util.Scanner;
public class countChar {

	public static void main(String[] args) {
		// TODO print the frequency of character in given string
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String a=in.next();
		System.out.println("Enter the Character : ");
		char c=in.next().charAt(0);
		int f=0;
		for(int i=0;i<a.length();i++) {
			if(a.charAt(i)==c)
				f++;
		}
		System.out.println("Frequency of '"+c+"' in "+a+" : "+f);
		in.close();
	}

}
