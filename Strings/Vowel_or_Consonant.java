package PST;
import java.util.Scanner;

public class Vowel_or_Consonant {

	public static void main(String[] args) {
		// TODO Check given char is vowel or consonant
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a Alphabet : ");
		String s = in.next();
		String vow="aeiouAEIOU";
		if (vow.contains(s)) {
			System.out.print("Vowel");
		}
		else {
			System.out.println("Consonant");
		}
		// Check Vowel or Consonant using .equals()
		System.out.println("Enter a Alphabet :");
		String x = in.next();
		if(x.equals("a")||(x.equals("e"))||(x.equals("i"))||(x.equals("o"))||(x.equals("u"))) {
			System.out.println("Vowel");
		}
		else {
			System.out.println("Consonant");
		in.close();
		}
	}	

}
