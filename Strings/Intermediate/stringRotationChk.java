package String;
import java.util.Scanner;
public class stringRotationChk {

	public static void main(String[] args) {
		// TODO to check whether the given string is rotation of the other string
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the String 1 : ");
		String a = in.next();
		String temp=a.toLowerCase();
		System.out.println("Enter the String 2 : ");
		String b=in.next().toLowerCase();
		String c="";
		boolean chk=true;
		if(a.length()==b.length()) {
			for(int i=0;i<a.length();i++) {
				for(int j=0;j<a.length();j++) {
					c+=temp.charAt((i+j+1)%temp.length());
				}
				if(strEquals(c,b)) {
					System.out.println("Yes, String 2 is rotation of String 1");
					break;
				}
				else {
					c="";
					chk=false;
				}
			}
		}
		else
			System.out.println("No, String 2 is not a rotation of String 1.");
		if(!chk)
			System.out.println("No, String 2 is not a rotation of String 1.");
		in.close();
	}
	static boolean strEquals(String a, String b) {
		for(int i=0;i<a.length();i++) {
			if (a.charAt(i)!=b.charAt(i))
				return false;
		}
		return true;
	}

}
