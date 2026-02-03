package Intermediate;
import java.util.Scanner;
public class Duck_number_06 {

	public static void main(String[] args) {
		// TODO Duck number checker
		// when a number contains a 0 in it, excluding at the begininning, then the number is Duck number.
		// eg: 5304 is a duck number
		// eg: 5425,0583 are not a duck number
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n=in.nextInt();
		int x=n;
		boolean chk=false;
		while (n>0) {
			if (n%10==0) {
				chk=true;
				break;
			}
			n/=10;
		}
		if (chk==true)
			System.out.println(x+" is a Duck number.");
		else
			System.out.println(x+" is not a Duck number.");
		in.close();

	}

}
