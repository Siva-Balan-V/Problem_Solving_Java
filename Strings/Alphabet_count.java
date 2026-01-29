package PST;
import java.util.Scanner;

public class Alphabet_count {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String a = in.nextLine(); 
        int upper = 0, lower = 0, symbols = 0, numbers = 0, spaces = 0;
        for (int i = 0; i < a.length(); i++) {
            char ch = a.charAt(i);            
            if (ch >= 'A' && ch <= 'Z') {
                upper++;
            } else if (ch >= 'a' && ch <= 'z') {
                lower++;
            } else if (ch >= '0' && ch <= '9') {
                numbers++;
            } else if (ch == ' ') {
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
