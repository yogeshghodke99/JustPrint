package day1;

public class calculator {

	public static void sum() {
		int a = 20;
		int b = 30;

		System.out.println(a + b);

	}
	public void mul() {
		int a=5464;
		int b =4;
		System.out.println(a*b);
	}

	public void div() {
		int a = 6469;
		int b = 2;
		System.out.println(a / b);
	}

	public void sub() {
		int a = 466;
		int b = 5664;
		System.out.println(b-a);

	}
public void print() {
	System.out.println("thanks");
}
	public static void main(String[] args) {
		System.out.println("welcome");
		int x = 80;
		double y = 0.1;
		System.out.println(x - y);

		int a = 30;
		int b = 30;
		System.out.println(a + b);

		calculator cal = new calculator();// object creation
		//cal.sum();
		sum();
		// calculator cal = new calculator();
		cal.sub();
		cal.div();
		cal.mul();
		cal.print();
		System.out.println("thankss");

		// TODO Auto-generated method stub

		//
	}

}
