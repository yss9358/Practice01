package com.javaex.practice;

import java.util.Scanner;

public class Ex34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		
		[Ex34.java]
				
		[문제] Ex18 사용자로부터 화씨 온도를 입력받아 
		     섭씨 온도로 변환하는 프로그램을 작성하세요.
		*[참고] ℃ : 섭씨 기호 ℉ : 화씨 기호
		화씨섭씨 ℃ = 5/9 * (℉ - 32) 섭씨화씨 ℉ = (℃ * 9/5) + 32
		
		*/
		
		Scanner sc = new Scanner(System.in);
			
		System.out.print("화씨: ");
		double a = sc.nextDouble();
		
		System.out.println("화씨 "+ a + " 의 섭씨온도는 " + (double)5/9*(a-32) + " 입니다.");
		
		System.out.print("화씨: ");
		double b = sc.nextDouble();
		
		System.out.println("화씨 "+ a + " 의 섭씨온도는 " + (double)5/9*(b-32) + " 입니다.");
		
		sc.close();
		
	}

}
