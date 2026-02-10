package Pattern;
import java.util.Scanner;
public class Alphabet_Triangle {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		char c='A';
		System.out.println("Enter the number of rows : ");
		int row=input.nextInt();
		for(int i=1;i<row+1;i++) {
			for(int j=0;j<i;j++) {
				System.out.print(c);
				c++;
			}
			System.out.println();
			c='A';
		}
		input.close();
	}
}
