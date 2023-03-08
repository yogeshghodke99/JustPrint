package array;

public class Evenodd {

	public static void main(String[] args) {
		int arr[] = { 1, 3, 4, 8, 9, 10 };
		for (int i = 0; i < 5; i++) {
			if (arr[i] % 2 == 0) {
				System.out.println("even numbers :" + arr[i]);
			} else {
				System.out.println("odd numbers :" + arr[i]);

			}

		}
		
		// without using array
		
		for(int a=1;a<=10;a++) {
			if (a%2==0) {
				System.out.println("even number: "+ a);
			}
		}

	}

}
