package org.opentutorials.javatutorials.conversion;

public class ConstantDemo {

	public static void main(String[] args) {
		
		// 실수는 기본형이 double 이므로 f로 형변환
		float a = 2.2f;
		double b = 2.2;
		
		// 정수는 기본형이 int 이므로 L로 형변환
		long c = 2147483648L;
		
		// byte 와 short에 한하여 int 형을 허용하기 때문에 오류 발생하지 않음
		byte d = 100;
		short e = 200;
		
		System.out.println("a: "+a +"\nb: " +b+"\nc: " +c+"\nd: " +d+"\ne: " +e);
	}

}
