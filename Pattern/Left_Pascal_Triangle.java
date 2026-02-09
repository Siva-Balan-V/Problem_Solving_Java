package Pattern;
import java.util.Scanner;
public class Left_Pascal_Triangle {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of rows : ");
		int n=input.nextInt();
		String c="*";
		int space=n;
		int rep=1;
		int rspace=1;
		int rrep=n;
		for(int i=n;i>0;i--) {
			System.out.print(" ".repeat(rrep));

			System.out.print(c.repeat(rspace));
			rrep--;
			rspace++;
			System.out.println();
		}
		for(int i=1;i<=n;i++) {
			System.out.print(" ".repeat(rep));

			System.out.print(c.repeat(space));
			rep++;
			space--;
			System.out.println();
		}
		
		
		input.close();
	}
	

}
