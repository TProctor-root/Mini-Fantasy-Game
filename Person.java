public abstract class Person implements Comparable {
	private String id;
	
	public Person(String name) {
		this.id = name;
	}
	String getName() {
		return this.id;
	}
	public int compareTo(Object otherPerson) {
		Person other = (Person) otherPerson;
		return this.getName().compareTo(other.getName());
	}
}
	
