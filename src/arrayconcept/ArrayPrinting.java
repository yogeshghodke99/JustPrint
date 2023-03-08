package arrayconcept;

public class ArrayPrinting {
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6};
		System.out.println(a[4]);
		
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		System.out.println("--------------------------");
	//horizantal 
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]);
			if(i<a.length-1) {
				System.out.print(",");
			}
		}
		
		//reverse printing
		for (int i=a.length-1;i>=0;i--) {
			System.out.println(a[i]);
		}
	}

}
