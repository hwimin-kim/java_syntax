package org.opentutorials.javatutorials.constant2;

enum Fruit {
	APPLE("red"), PEACH("pink"), BANANA("yellow");

	private String color;

	Fruit(String color) {
		this.color = color;
		System.out.println("call Constructor " + this);
	}

	String getColor() {
		return this.color;
	}
}

enum Company {
	GOOGLE, APPLE, ORACLE;
}

public class ConstantDemo {

	public static void main(String[] args) {

		for (Fruit f : Fruit.values()) {
			System.out.println(f + "," + f.getColor());
		}
		/*
		 * Fruit type = Fruit.APPLE; switch (type) { case APPLE: System.out.println(57 +
		 * " kcal, " + Fruit.APPLE.getColor()); break; case PEACH: System.out.println(34
		 * + " kcal, " + Fruit.PEACH.getColor()); break; case BANANA:
		 * System.out.println(93 + " kcal, " + Fruit.BANANA.getColor()); break; }
		 */
	}

}
