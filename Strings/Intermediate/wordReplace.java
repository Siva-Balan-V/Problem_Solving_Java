package String;
import java.util.Scanner;
import Array.Arr;
public class wordReplace {

	public static void main(String[] args) {
		// To replace a given word in the sentence with the other give word
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a Sentence : ");
		String a= in.nextLine();
		System.out.println("Enter the word to replace : ");
		String chk=in.next();
		System.out.println("Enter the replacing word : ");
		String change=in.next();
		String[] l=a.split(" ");
		for(int i=0;i<l.length;i++) {
			if(chk.contentEquals(l[i])) {
				l[i]=change;
				break;
			}				
		}
		String n= Arr.toString(l);
		System.out.println(n);
		in.close();
	}

}
