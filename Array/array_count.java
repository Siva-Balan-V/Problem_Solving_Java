package PST;
import java.util.Scanner;
public class array_count {

	public static void main(String[] args) {
		// TODO To count the number of odd elements and even elements
		int size;
		int even=0;
		int odd=0;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Size of the Array : ");
		size = in.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter the elements of array : ");
		for(int i=0;i<size;i++) {
			arr[i]=in.nextInt();
		}
		for(int i=0;i<size;i++) {
			if (arr[i]%2==0){
				even++;
			}
			else {
				odd++;
			}
		}
		System.out.println("Count of odd elements : "+odd);
		System.out.println("Count of even elements : "+even);		
		in.close();
	}

}
