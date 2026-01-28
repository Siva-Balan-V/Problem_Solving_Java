package PST;
import java.util.Scanner;
public class Fibonacci {

	public static void main(String[] args) {
		// TODO Print the Fibonacci Series
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a Whole number :");
		int num=in.nextInt();
		if (num<0) {
			System.out.println("Enter a Whole number !!!");
		}
		else if (num==1) {
			System.out.println(0);
		}
		else if (num==2) {
			System.out.println("0,1,");
		}
		else {
			int n3,n1=0,n2=1;
			System.out.print("0,1,");
			for(int i=0;i<num-2;i++) {
				n3=n1+n2;
				n1=n2;
				n2=n3;
				System.out.print(n3+",");
			}
		}
		in.close();
	}
}
