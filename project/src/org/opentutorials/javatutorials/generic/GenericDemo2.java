package org.opentutorials.javatutorials.generic;

class EmployeeInfo {
	public int rank;

	EmployeeInfo(int rank) {
		this.rank = rank;
	}
}

class Person2<T, S> {
	public T info;
	public S id;

	Person2(T info, S id) {
		this.info = info;
		this.id = id;
	}

	public <U> void printInfo(U info) {
		System.out.println(info);
	}
}

public class GenericDemo2 {

	public static void main(String[] args) {
		EmployeeInfo e = new EmployeeInfo(1);
		Integer i = 10;
		/*
		 * 생략 전 Person2<EmployeeInfo, Integer> p1 = new Person2<EmployeeInfo,
		 * Integer>(e, i); System.out.println(p1.id.intValue());
		 * System.out.println(p1.info.rank);
		 */

		/*
		 * 생략 후 제네릭의 필드 값은 object가 되므로 필드 내부의 필드에 접근이 불가능하다. 명시적으로 형변환을 이용하여 필드 내부의 필드에
		 * 접근가능
		 */
		Person2 p1 = new Person2(e, i);
		System.out.println(((Integer) p1.id).intValue());
		System.out.println(((EmployeeInfo) p1.info).rank);
		p1.printInfo(e);
	}

}
