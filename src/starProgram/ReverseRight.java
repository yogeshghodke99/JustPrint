package starProgram;

public class ReverseRight {

	public static void main(String[] args) {
	//	int r,c,s;
		for(int r=1; r<=10;r++) {
			for(int s=r;s>=2;s--) {
				System.out.print(" ");
			}
			for(int c=r;c<=10;c++) {
				System.out.print("*");
			}
			System.out.println();
			
		}
	}

}
