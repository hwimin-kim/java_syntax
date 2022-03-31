package org.opentutorials.javatutorials.exception;

// Exception을 상속받기 때문에 checked 해주어야한다.
// RuntimeException을 상속받으면 unchecked
class DivideException extends Exception {
	public int left, right;

//	DivideException() {
//		super();
//	}

	DivideException(String message) {
		super(message);
	}

	DivideException(String message, int left, int right) {
		super(message);
		this.left = left;
		this.right = right;
	}
}

class Calculator {
	int left, right;

	public void setOprands(int left, int right) {
		this.left = left;
		this.right = right;
	}

	public void divide() throws DivideException {
		if (this.right == 0) {
			throw new DivideException("0으로 나누는 것은 허용되지 않습니다.", left, right);
		}
		System.out.print(this.left / this.right);
	}
}

public class CalculatorDemo {

	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		c1.setOprands(10, 0);
		try {
			c1.divide();
		} catch (DivideException e) {
			System.out.println(e.getMessage());
			System.out.println("left: " + e.left);
			System.out.println("right: " + e.right);
		}
	}

}
