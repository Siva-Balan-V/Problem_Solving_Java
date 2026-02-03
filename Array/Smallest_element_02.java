package Array;

public class Smallest_element_02 {
	public static void main(String[] args) {
		// TODO To find the smallest element in array
		int[] arr = Arr.input();
		int smallest=arr[0];
		for(int i=0;i<arr.length;i++) {
			if (smallest>arr[i]) {
				smallest=arr[i];
			}
		}
		System.out.println("Smallest element in array : " + smallest);
	}
}
