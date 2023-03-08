package starProgram;

public class RightangleRightTrieangle {
	public static void main(String[] args) {
		int r, c, s;
		for (r = 1; r <= 10; r++) {
			for (s = r; s < 10; s++) {
				System.out.print(" ");
			}
			for (c = 1; c <= r; c++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}

//n = 5;
//for (a=0;a<n;a++) {
//	 System.out.print(" ");
//}
//for(b=0;b<=a;b++) {
//	 System.out.print("* ");
//}
//System.out.println();
//