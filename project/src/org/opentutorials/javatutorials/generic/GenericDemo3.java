package org.opentutorials.javatutorials.generic;

interface Info {
	int getLevel();
}

class EmployeeInfo2 implements Info {

	public int rank;

	EmployeeInfo2(int rank) {
		this.rank = rank;
	}

	public int getLevel() {
		return this.rank;
	}
}

class Person3<T extends Info> {
	public T info;

	public Person3(T info) {
		this.info = info;
	}
}

public class GenericDemo3 {

	public static void main(String[] args) {

		Person3 p1 = new Person3(new EmployeeInfo2(1));
		// Info 클래스 및 자식 클래스만 오도록 강제하므로 에러 발생
		// Person3 p2 = new Person3("부장");
	}

}
