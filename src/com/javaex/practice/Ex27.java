package com.javaex.practice;

import java.util.Scanner;

public class Ex27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		
		[Ex27.java]
		
		반지름을 입력받아 원의 면적을 구하는 프로그램을 작성하세요. 
		(파이값은 3.14로 상수로 지정)
		
		---------------------------------------------
		// final 을 변수앞에 넣어 상수로 지정한다.
		// 스캐너 추가 + 상수 선언 + 입력값 요구 + 출력 + 스캐너종료
	
		*/
		
		Scanner sc = new Scanner(System.in);
				
		final double pi = 3.14;
		
		System.out.println("반지름을 입력하세요.");
		System.out.print("반지름: ");
		
		int r = sc.nextInt();
		
		System.out.println("원의 넓이는 "+ (r*r*pi));
		
		sc.close();

	}

}
