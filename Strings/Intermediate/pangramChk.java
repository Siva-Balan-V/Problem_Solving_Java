package String;
import java.util.Scanner;
public class pangramChk {

	public static void main(String[] args) {
		// TO check if all the alphabets are present in given string
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String a=in.nextLine().toLowerCase();
		boolean chk=true;
		for(char i='a';i<='z';i++) {
			if(a.indexOf(i)==-1) {//if the character is not present it returns -1
				chk=false;
				break;				
			}
		}
		if(chk==true)
			System.out.println("The given String is a Pangram");
		else
			System.out.println("The given String is not a Pangram.");
		in.close();
	}

}
