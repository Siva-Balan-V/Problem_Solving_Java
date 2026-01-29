package PST;
import java.util.Scanner;
public class Length {

	public static void main(String[] args) {
		// TODO To find the length of the String without using predefined function
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a String :");
		String a = in.next();
		int size=0;
		try {
			while(true) {
				a.charAt(size);
				size++;
			}
		}
		catch(IndexOutOfBoundsException e){
			System.out.println("Length of the String : "+size);
		}
		in.close();
	}

}
