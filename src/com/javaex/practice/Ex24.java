package com.javaex.practice;

public class Ex24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		
		[Ex24.java]
		다음의 코드는 화씨 온도를 섭씨 온도로 변환하는 프로그램이다.
		결과값이 0이 나오는 이유는 무엇이며 정상인 결과가 나오도록 수정하세요.
		
		public static void main(String[] args){
		
		   double f= 80.0;
		   System.out.println(5/9*(f-32.0));
		   
		// *참고 네모 = 섭씨기호, F = 화씨 기호
		// 화씨 -> 섭씨 = 5/9 *(섭씨-32)
		// 섭씨 -> 화씨 = (섭씨*9/5)+32
		
	--------------------------------------------
	
	    - (double)을 식 앞에 붙여주면 0이 나오지않는다.
	    - (int)를 붙이면 결과값이 0이 나오고 (double)을 붙이면 26.666이 나온다.
	    - 축소변환되어 소수점이하의 자료를 잃은것으로 생각됨..
	    - 확실치 않음.
		
		*/
		
		double f= 80.0;
		System.out.println((double)5/9*(f-32.0));
		
	}

}
