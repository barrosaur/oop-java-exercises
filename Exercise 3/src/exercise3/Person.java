package exercise3;

public class Person {
	private String name;
	private int age;
	
	public Person() {
		this.name = "";
		this.age = 0;
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setPerson(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public boolean samePerson(Person otherPerson) {
		return this.name.equals(otherPerson.name) && this.age == otherPerson.age;
	}
	
	public boolean sameName(Person otherPerson) {
		return this.name.equals(otherPerson.name);
	}
	
	public boolean sameAge(Person otherPerson) {
		return this.age == otherPerson.age;
	}
	
	public boolean isOlder(Person otherPerson) {
		return this.age > otherPerson.age;
	}
	
	public boolean isYounger(Person otherPerson) {
		return this.age < otherPerson.age;
	}
}
