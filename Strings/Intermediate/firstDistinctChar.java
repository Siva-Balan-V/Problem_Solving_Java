package String;
import java.util.Scanner;
public class firstDistinctChar {

	public static void main(String[] args) {
		// TODO find the first non recurring character in a String
		Scanner in = new Scanner (System.in);
		System.out.println("Enter a String : ");
		String a = in.next();
		int c=0;
		int chk=0;
		for(int i=0;i<a.length();i++) {
			for(int j=0;j<a.length();j++) {
				if (a.charAt(i)==a.charAt(j) & i!=j) // Checking repeating character excluding the same character
					c++;
			}
			if (c==0) {
				System.out.println("First non repeating character : "+a.charAt(i));
				chk=1;
				break;
			}
			c=0;
		}
		if(chk==0)
			System.out.println("No non recurring characters present in String.");
		in.close();
		
	}

}
