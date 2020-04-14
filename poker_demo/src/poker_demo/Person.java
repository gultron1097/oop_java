package poker_demo;

public class Person {
	public String name;
	public char gender;
	private int age;
	
	public Person() {
		this.name = "";
		this.gender = 'F';
		this.age = 18;
	}
	
	public Person(String name, char gender, int age) {
		this.name = name;
		this.gender = gender;
		this.age = age;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
