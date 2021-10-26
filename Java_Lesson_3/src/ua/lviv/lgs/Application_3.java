package ua.lviv.lgs;

public class Application_3 {

	public static void main(String[] args) {

		Animal a1 = new Animal();

		a1.setAge(11);
		a1.setName("Oleg");
		a1.setColor("red");

		Animal a2 = new Animal(25);

		Animal a3 = new Animal("Chimpanzee", "Make", 50, "black");

		System.out.println(a1.getAge());

		System.out.println(a2);
		System.out.println(a3);

	}

}
