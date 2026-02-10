package Pattern;
import java.util.Scanner;
public class Binary_Triangle {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of rows : ");
		int row = input.nextInt();
		String str="";
		for(int i=0;i<row;i++) {
			if (i%2==0) {
				str="1"+str;
				System.out.print(str);
			}
			else {
				str="0"+str;
				System.out.print(str);
			}
			System.out.println();
		}
		input.close();
	}

}
