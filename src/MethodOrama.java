import javax.swing.JOptionPane;

public class MethodOrama {
	static String Name;
	String Names;

	public static void main(String[] args) {
		iRock();
		truth();
	}

	public static void iRock() {

		String Name = JOptionPane.showInputDialog(" Type in someones name :");
		System.out.println( Name + " Rocks ");
	}

	public static void truth() {

		String Names = JOptionPane.showInputDialog("Type in someones name :");
		if (Names.contains("sherlin")) {
			System.out.println(Names + " is awesome");
		}
		if (Names.contains("Justin Biber")) {

			System.out.println(Names + " is amazing ");
		}

	}
}
