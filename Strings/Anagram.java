package String;
import java.util.Scanner;
public class Anagram {

	public static void main(String[] args) {
		// TODO Check two string where, String2 is just the rearrangement of String1
		Scanner in = new Scanner(System.in);
		String str1,str2;
		System.out.println("Enter Two String : ");
		str1=in.next();
		str2=in.next();
		in.close();
		boolean chk=true;
		if (str1.length()==str2.length()) {
			for(int i=0;i<str1.length();i++) {
				if (str2.indexOf(str1.charAt(i))==-1) {
					chk=false;
					break;
				}
				else {
					str2=str2.replace(str1.charAt(i),'_');
				}
			}
			
		}
		for(int i=0;i<str1.length();i++) {
			if (str2.charAt(i)!='_') {
				chk=false;
				break;
			}
		}
		if(chk==true) {
			System.out.println("The Strings are anagrams.");
		}
		else
			System.out.println("The Strings are not anagrams");
	}
}
