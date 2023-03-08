package starProgram;

public class InverseLeftTriangle {

	public static void main(String[] args) {
		for(int a=1;a<=9;a++) {
			for(int b=9;b>=a;b--) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}

}
