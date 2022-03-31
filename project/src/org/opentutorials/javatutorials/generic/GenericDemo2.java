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
		 * ���� �� Person2<EmployeeInfo, Integer> p1 = new Person2<EmployeeInfo,
		 * Integer>(e, i); System.out.println(p1.id.intValue());
		 * System.out.println(p1.info.rank);
		 */

		/*
		 * ���� �� ���׸��� �ʵ� ���� object�� �ǹǷ� �ʵ� ������ �ʵ忡 ������ �Ұ����ϴ�. ��������� ����ȯ�� �̿��Ͽ� �ʵ� ������ �ʵ忡
		 * ���ٰ���
		 */
		Person2 p1 = new Person2(e, i);
		System.out.println(((Integer) p1.id).intValue());
		System.out.println(((EmployeeInfo) p1.info).rank);
		p1.printInfo(e);
	}

}
