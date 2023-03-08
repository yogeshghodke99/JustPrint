package array;

public class SinglelineOutput {

	public static void main(String[] args) {
		int arr[]= {2,3,5,6,7,9,10};
		for (int i=0;i<=6;i++) {
			if(arr[i]%2==0) {
				System.out.print(arr[i]);
				if (i<6);
				System.out.print(",");
			}
		}
	}

}
