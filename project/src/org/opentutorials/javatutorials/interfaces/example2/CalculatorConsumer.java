package org.opentutorials.javatutorials.interfaces.example2;

class CalculatorDummy implements Calculatable {
	public void setOprands(int first, int second, int third) {

	}

	public int sum() {
		return 60;
	}

	public int avg() {
		return 20;
	}
}

public class CalculatorConsumer {

	public static void main(String[] args) {

		Calculator c = new Calculator();
		c.setOprands(20, 30, 40);
		System.out.println(c.sum() + c.avg());
	}

}
