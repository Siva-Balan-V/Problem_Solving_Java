package ASCII;

public class A_to_Z_a_to_z {

	public static void main(String[] args) {
		// TODO Print the ASCII Values of Uppercase and Lowercase alphabets
		System.out.println("Upper Case Alphabets : \n");
		for(char i='A';i<='Z';i++) {
			System.out.println(i+" : "+(int)i);
		}
		System.out.println("\nLower Case Alphabets : \n");
		for(char i='a';i<='z';i++) {
			System.out.println(i+" : "+(int)i);
		}
	}

}
