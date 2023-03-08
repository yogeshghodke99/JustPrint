package array;

public class ArrayPrinting {

	public static void main(String[] args) {
		int arr[] = { 4, 3, 5, 6, 7, 8, 9, 3 };
		for (int i = 0; i < 7; i++) {
			System.out.print(arr[i]);
			if (i < 6) {
				System.out.print(",");
			}
		}

	}

}
