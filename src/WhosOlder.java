public class WhosOlder {
	public static void main(String[] args) {
		old("Sherlin", 12, "June", 36);
	}

	public static void old(String name, int age, String OtherName, int OtherAge) {
		if (age > OtherAge) {
			System.out.println(name + " is older");
		} else if (OtherAge < age) {
			System.out.println(OtherName + " is older");
		}
	}
}
