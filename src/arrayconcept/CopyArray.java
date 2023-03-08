package arrayconcept;

public class CopyArray {
	public static void main(String[] args) {
//		int a[]= {1,3,5,7,9};
//		int b[]=new int[5];
//		//System.out.println(b.length);
//		//System.out.println(a.length);
//		b[0]=1;
//		b[1]=3;
//		b[2]=5;
//		b[3]=7;
//		b[4]=9;
//		for(int i=0;i<b.length;i++) {
//			System.out.print(b[i]);
//		}
		
		
		
		int a[]= {1,2,4,2,5,7,4,7,2};
		int b[]= new int[9];
			for(int i=0;i<a.length;i++) {
				b[i]=a[i];
			}
			for(int j=0;j<b.length;j++) {
				System.out.println(b[j]);
			}
		
		
		
		
	}

}
