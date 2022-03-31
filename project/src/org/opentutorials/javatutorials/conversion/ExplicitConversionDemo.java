package org.opentutorials.javatutorials.conversion;

public class ExplicitConversionDemo {

	public static void main(String[] args) {
		
		/*
		 데이터 값의 범위가 변수 값의 범위보다 커서 오류 발생
		 float a = 100.0;
		 int b = 100.0F;
		 */
		
		float a = (float)100.0;
		int b = (int)100.1F; // int b = 100, 형변환 하면 소수점 이하 날라감

	}

}
