package Array;
public class Even_Odd_Count_Array_05 {

	public static void main(String[] args) {
		// TODO count the number of odd elements and even elements
		int size,even=0,odd=0;
		int[] arr=Arr.input();
		size=arr.length;
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
	}

}
