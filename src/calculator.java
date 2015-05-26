import javax.swing.JOptionPane;

public class calculator {

	int two;
	int total;

	public static void main(String[] args) {

		calculator cal = new calculator();
	}

	calculator() {
		String user = JOptionPane
				.showInputDialog("What would you like to do: MULTIPLICATION, ADDITION, SUBTRACTION, DIVISION");

		if (user.contains("multiplication")) {
			multiply(10, 10);

		}
		if (user.contains("addition")) {
			addition(5, 10);
		}

		if (user.contains("subtraction")) {
			subtraction(20, 10);
		}

		if (user.contains("division")) {
			divide(100, 5);
		}

	}

	int multiply(int one, int two) {

		total = one * two;

		System.out.println(total = one * two);
		return total;
	}

	int divide(int one, int two) {

		total = one / two;

		System.out.println(total = one * two);
		return total;
	}

	int addition(int one, int two) {

		total = one + two;

		System.out.println(total = one * two);
		return total;
	}

	int subtraction(int one, int two) {

		total = one - two;

		System.out.println(total = one * two);
		return total;
	}
}