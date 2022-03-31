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
		// Info Ŭ���� �� �ڽ� Ŭ������ ������ �����ϹǷ� ���� �߻�
		// Person3 p2 = new Person3("����");
	}

}
