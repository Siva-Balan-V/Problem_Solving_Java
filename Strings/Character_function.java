package PST;
import java.util.Scanner;

public class Character_function {
    public static void main(String[] args) {
    	//Using Predefined Functions
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a String : ");    
        String a = in.nextLine(); 
        int upper = 0, lower = 0, symbols = 0, numbers = 0, spaces = 0;

        for (int i = 0; i < a.length(); i++) {
            char ch = a.charAt(i);    
            if (Character.isUpperCase(ch)) {
                upper++;
            } else if (Character.isLowerCase(ch)) {
                lower++;
            } else if (Character.isDigit(ch)) {
                numbers++;
            } else if (Character.isWhitespace(ch)) {
                spaces++;
            } else {
                symbols++;
            }
        }

        System.out.println("Uppercase : " + upper);
        System.out.println("Lowercase : " + lower);
        System.out.println("Numbers : " + numbers);
        System.out.println("Spaces : " + spaces);
        System.out.println("Symbols : " + symbols);
        System.out.println("Total Alphabets : " + (upper + lower));

        in.close();
    }
}
	
