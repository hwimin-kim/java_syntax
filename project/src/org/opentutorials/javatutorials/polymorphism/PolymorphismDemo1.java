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
		// 클래스B의 생성자를 A타입의 인스턴스에 담으면 A인것 처럼 행동한다.
		A obj = new B();
		A obj2 = new B2();

		// A인것 처럼 행동하기 떄문에 A클래스에는 y메소드가 없으므로 오류발생
		// System.out.println(obj.y());

		// A처럼 행동하므로 A의 메소드만 실횅가능
		// 단, 상속받은 클래스에 오버라이딩한 메소드가 있으면 그 메소드를 실행.
		System.out.println(obj.x());

		System.out.println(obj2.x());

	}

}
