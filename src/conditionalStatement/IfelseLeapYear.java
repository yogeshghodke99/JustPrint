package conditionalStatement;

public class IfelseLeapYear {
	public static void main(String[]args) {
		int year = 2017;
		if((year%4==0)||(year%400==0)) {
			System.out.println("leap year");
		}
		else  {
			System.out.println("non leap year");
		}
		
			
	}
}
//}
	