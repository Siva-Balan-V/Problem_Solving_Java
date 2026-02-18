package String;
import java.util.Scanner;
public class onlyDigit {

	public static void main(String[] args) {
		// TODO check whether the string is filled with only digits
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String str = in.next();
		if (chk(str))
			System.out.println(str+" is Digit");
		else
			System.out.println(str+" not only Digit");
		in.close();
	}
	static boolean chk(String a){
		boolean chk=true;
		for(int i=0;i<a.length();i++)
			if (a.charAt(i)<48 || a.charAt(i)>57)
				chk=false;
		return chk;
	}

}
