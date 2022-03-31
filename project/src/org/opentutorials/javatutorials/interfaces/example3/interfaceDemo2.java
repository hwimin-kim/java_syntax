package org.opentutorials.javatutorials.interfaces.example3;

interface I3 {
	public void x();
}

interface I4 extends I3 {
	public void z();
}

class interfaceDemo2 implements I4 {
	public void x() {
	}

	public void z() {

	}
}
