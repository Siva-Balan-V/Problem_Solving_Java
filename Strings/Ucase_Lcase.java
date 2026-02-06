package String;
import java.util.Scanner;
public class Ucase_Lcase {

	public static void main(String[] args) {
		// to print in Uppercase and Lowercase
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String a = in.next();
		System.out.println("UPPERCASE : "+a.toUpperCase());
		System.out.println("lowercase : "+a.toLowerCase());
		in.close();
	}

}
