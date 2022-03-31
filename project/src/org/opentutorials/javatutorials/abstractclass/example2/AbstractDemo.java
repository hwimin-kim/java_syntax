package org.opentutorials.javatutorials.abstractclass.example2;

abstract class A {
	public abstract int b();

	public void d() {
		System.out.println("hihi");
	}
}

class B extends A {
	public int b() {
		return 1;
	}
}

public class AbstractDemo {

	public static void main(String[] args) {

		B b1 = new B();
		System.out.println(b1.b());
	}

}
