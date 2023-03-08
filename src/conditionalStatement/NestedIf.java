package conditionalStatement;

public class NestedIf {

	public static void main(String[] args) {
		int age = 45;
		int weight = 46;
		if (age >= 18) {
			System.out.println("Eligible for weight check");

			if (weight >= 50) {
				System.out.println("can fone the bloood");

			} else {
				System.out.println("not eligible due to weight criteria");
			}

		}

		else {
			System.out.println("not eligible due to age criteria");
		}
	}

}
