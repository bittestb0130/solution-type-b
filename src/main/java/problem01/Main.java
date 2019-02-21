package problem01;

public class Main {
	public static void main(String[] args) {
		int[] arr = { -10, -3, 5, 6, -20 };
		findMaxProduct(arr);
	}

	public static void findMaxProduct(int[] arr) {
	
		int temp_one = arr[0] * arr[0];
		int temp_two = arr[0] * arr[0];
		int[] index = new int[2];
		
		for(int i = 0; i < arr.length; i++) {
			if(temp_one < arr[i] * arr[i]) {
				temp_two = temp_one;
				temp_one = arr[i] * arr[i];
				index[1] = index[0];
				index[0] = i ; 
			}
		}
		
		
		
		System.out.println("[" + arr[index[1]] + "," + arr[index[0]] + "]");
		
	}
}
