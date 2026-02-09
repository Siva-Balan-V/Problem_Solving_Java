package Pattern;
import java.util.Scanner;
public class Hollow_Pyramid {

	public static void main(String[] args) {
		// TODO a hollow pyramid
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of rows : ");
		int n = in.nextInt();
		System.out.println("Enter the Charecter to be printed " );
		String c= in.next();
		for (int i=1;i<=n;i++) {
			for(int j=i;j<n;j++) {
				System.out.print(" ");	
			}
			for(int k=1;k<=2*i-1;k++) {
				if (k==1||k==2*i-1||i==n)
					System.out.print(c);
				else
					System.out.print(" ");
			}
			System.out.println("");
		}
		in.close();
	}
}
