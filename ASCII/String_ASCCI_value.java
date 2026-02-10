package ASCII;
import java.util.Scanner;
public class String_ASCCI_value {

	public static void main(String[] args) {
		// TODO ASCII Value of the characters in the string 
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String in=input.next();
		for (int i=0;i<in.length();i++) {
			System.out.println(in.charAt(i)+" : "+(int)in.charAt(i));
		}
		input.close();
	}

}
