package Pattern;
import java.util.Scanner;
public class Butterfly_Pattern {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of rows : ");
		int n=input.nextInt();
		String c="*";
		int space=n;
		int rep=1;
		for(int i=1;i<=n;i++) {
			System.out.print(c.repeat(rep));
			System.out.print(" ".repeat(space));
			System.out.print(c.repeat(rep));
			rep++;
			space--;
			System.out.println();
		}
		int rspace=1;
		int rrep=n;
		for(int i=n;i>0;i--) {
			System.out.print(c.repeat(rrep));
			System.out.print(" ".repeat(rspace));
			System.out.print(c.repeat(rrep));
			rrep--;
			rspace++;
			System.out.println();
		}
		input.close();
	}
	

}
