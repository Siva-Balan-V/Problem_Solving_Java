package Intermediate;
import java.util.Scanner;
public class HCF_10 {

	public static void main(String[] args) {
		// To find the HCF of a number
		Scanner in =new Scanner(System.in);
		System.out.println("Enter two natural numbers : ");
		int n1,n2;
		n1=in.nextInt();
		n2=in.nextInt();
		for(int i=n1/2;i>=1;i--) {
			if (n1%i==0 && n2%i==0) {
				System.out.println(i+" is the HCF of "+n1+" and "+n2);
				break;
			}
		}
		in.close();
	}
}
