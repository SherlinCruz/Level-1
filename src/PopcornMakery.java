
public class PopcornMakery {
	public static void main(String[] args) {

		Popcorn PC = new Popcorn("Ketel Corn");
		Microwave M = new Microwave();

		M.putInMicrowave(PC);
		M.setTime(2);
		M.startMicrowave();
		PC.applyHeat();
		PC.pause();

	}
}
