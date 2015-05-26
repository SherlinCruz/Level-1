public class Smurf2 {
	public static void main(String[] args) {
		Smurf smurf = new Smurf("Handy ");

		String name = smurf.getName();

		System.out.println(name);
		
		smurf.eat();
	
		String hat = smurf.getHatColor("White");
		
		System.out.println(hat);
	}
}
