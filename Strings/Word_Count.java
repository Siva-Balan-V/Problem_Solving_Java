package String;
import java.util.Scanner;
public class Word_Count {

	public static void main(String[] args) {
		// TODO count the number of words in the string
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String a = in.nextLine();
		a=a.strip();
		String[] b = new String[20293845];//some random size
		b=a.split(" ");// splits it into array based on the parameter passed
		System.out.println(b.length);
		in.close();
	}

}
