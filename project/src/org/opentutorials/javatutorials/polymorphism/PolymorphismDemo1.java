package org.opentutorials.javatutorials.polymorphism;

class A {
	public String x() {
		return "A.x";
	}
}

class B extends A {
	public String x() {
		return "B.x";
	}

	public String y() {
		return "y";
	}
}

class B2 extends A {
	public String x() {
		return "B2.x";
	}
}

public class PolymorphismDemo1 {

	public static void main(String[] args) {
		// Ŭ����B�� �����ڸ� AŸ���� �ν��Ͻ��� ������ A�ΰ� ó�� �ൿ�Ѵ�.
		A obj = new B();
		A obj2 = new B2();

		// A�ΰ� ó�� �ൿ�ϱ� ������ AŬ�������� y�޼ҵ尡 �����Ƿ� �����߻�
		// System.out.println(obj.y());

		// Aó�� �ൿ�ϹǷ� A�� �޼ҵ常 ��ȷ����
		// ��, ��ӹ��� Ŭ������ �������̵��� �޼ҵ尡 ������ �� �޼ҵ带 ����.
		System.out.println(obj.x());

		System.out.println(obj2.x());

	}

}
