package Pattern;
import java.util.Scanner;

public class Hourglass_Pattern {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of rows : ");
        int n = in.nextInt();
        String c = "*";
        for (int i = 0; i < n; i++) {
            System.out.print(" ".repeat(i));
            System.out.print(c.repeat(n * 2 - 1 - 2 * i));
            System.out.println();
        }
        for (int i = 1; i < n; i++) {
            System.out.print(" ".repeat(n - 1 - i));
            System.out.print(c.repeat(2 * i + 1));
            System.out.println();
        }        
        in.close();
    }
}
