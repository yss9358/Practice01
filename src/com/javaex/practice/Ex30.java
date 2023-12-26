package com.javaex.practice;

import java.util.Scanner;

public class Ex30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		
		[Ex30.java]
				
	    마일을 km로 변환하는 프로그램을 작성하세요.
	    (1마일 = 1.609km 상수로 지정)
		
		*/
		
		Scanner sc = new Scanner(System.in);
		
		final double a = 1.609;
		
		System.out.print("마일을 입력하세요: ");
		double b = sc.nextDouble();
		System.out.println(b+"마일은 "+(a*b)+"킬로미터 입니다.");
		
		System.out.print("마일을 입력하세요: ");
		double c = sc.nextDouble();
		System.out.println(c+"마일은 "+(a*c)+"킬로미터 입니다.");
			
		sc.close();

	}

}
