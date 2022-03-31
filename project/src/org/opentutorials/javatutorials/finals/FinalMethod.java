package org.opentutorials.javatutorials.finals;

class A {
	final void b() {
	}
}

class B extends A {
	// 오버라이딩(재정의)하려하기 때문에 오류 발생
	// void b(){}
}
