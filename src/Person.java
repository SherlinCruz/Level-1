public class Person {
	String name;
	String superpowers;

	public Person(String name, String superpowers) {
		this.name = name;
		this.superpowers = superpowers;
	}

	public String getName(String Name) {
		return this.name;

	}

	public String getSuperpowers(String superpowers) {
		return this.superpowers;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSuperpower(String superpowers) {
		this.superpowers = superpowers;
	}

	public void everything() {
		System.out.println(" Hi i'm " + this.name + " my superpowers is "
				+ this.superpowers);
	}
}
