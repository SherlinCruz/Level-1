import javax.swing.JOptionPane;

public class Friends {

	public static void main(String[] args) {

		// 3. Create an instance of Classmate for each person in your class.

		Classmate melissa = new Classmate();
		melissa.setDis(" hair is super cute ");
		System.out.println(melissa.getDis());
		JOptionPane.showInputDialog(melissa.getDis());

		Classmate toby = new Classmate();
		toby.setDis("Wears glasse and is really funny");
		System.out.println(toby.getDis());
		JOptionPane.showInputDialog(toby.getDis());

		Classmate drew = new Classmate();
		drew.setDis("Astonishing and a Great helper");
		System.out.println(drew.getDis());
		JOptionPane.showInputDialog(drew.getDis());

		Classmate kanvar = new Classmate();
		kanvar.setDis("Long Eyelashes.");
		System.out.println(kanvar.getDis());
		JOptionPane.showInputDialog(kanvar.getDis());

		Classmate joey = new Classmate();
		joey.setDis("Super cool! and nice eyes");
		System.out.println(joey.getDis());
		JOptionPane.showInputDialog(joey.getDis());

		// 4. set descriptions for each Classmate

		// 5. Use your getter to print out each description

	}

}

class Classmate {
	String description;

	// 1. create a setter that sets a description for this person
	void setDis(String description) {
		{
			this.description = description;
		}

	}

	// 2. create a getter that gets a description of this person

	public String getDis() {
		return description;
	}

}
