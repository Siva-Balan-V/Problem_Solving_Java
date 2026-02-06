package String;
import java.util.Scanner;
public class Swap {

	public static void main(String[] args) {
		// TODO Swap the first and last letter of java
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String a = input.next();
		String b="";
		b+=a.charAt(a.length()-1);
		for(int i=1;i<a.length()-1;i++) {
			b+=a.charAt(i);
		}
		b+=a.charAt(0);
		a=b;
		System.out.println("Swapped String : "+a);
		input.close();
	}

}
