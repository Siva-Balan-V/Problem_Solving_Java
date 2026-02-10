package ASCII;
import java.util.Scanner;
public class Ucase_Lcase_chk {

	public static void main(String[] args) {
		// TODO Check whether given character is Upper case or Lower case using ASCII Value
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a Alphabet : ");
		char in = input.next().charAt(0);
		int value= in;
		if(value>=65 && value<=90)
			System.out.println(in+" : is UPPER CASE Alphabet.");
		else if(value>=97 && value<=122)
			System.out.println(in+" : is LOWER CASE Alphabet.");
		else
			System.out.println(in+" is not a Alphabet.");
		input.close();
	}

}
