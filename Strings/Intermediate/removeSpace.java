package String;
import java.util.Scanner;
public class removeSpace {

	public static void main(String[] args) {
		// Print after removing the space in the given string
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String a = in.nextLine();
		String b = "";
		for(int i=0;i<a.length();i++) {
			if(a.charAt(i)!=' ')
				b+=a.charAt(i);
		}
		System.out.println("Enter String after removing space characters : "+b);
		in.close();
	}

}
