package starProgram;

public class DoubleTriangle {

	public static void main(String[] args) {

		for (int a = 1; a <= 6; a++) {
			for (int b = 1; b <= a; b++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}

		for (int c = 1; c <= 5; c++) {
			for (int d = 5; d >= c; d--) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}
	}

}
