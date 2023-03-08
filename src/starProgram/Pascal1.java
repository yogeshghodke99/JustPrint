package starProgram;

public class Pascal1 {

	public static void main(String[] args) {
		int rows1 = 11;
		int rows2= 10;
		for (int i = 1; i <= rows1 ; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for (int i = rows2 ; i >= 1; i--) {
			for (int j = 1; j <= i ; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
