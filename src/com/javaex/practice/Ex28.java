package com.javaex.practice;

import java.util.Scanner;

public class Ex28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		
		[Ex28.java]
		
		원화를 달러화로 계산하는 프로그램을 작성하세요.
		(환율 1달러 = 1230.95원 상수로 지정)
		
		- 입력받을 값을 계속 변수지정을 해주어야 한다?..
		
		*/
		
		Scanner sc = new Scanner(System.in);
		
		final double $ = 1230.95;
		
		System.out.print("환전할 원화를 입력하세요: ");
		
		double a = sc.nextDouble(); // a = 입력받을 원화
		double b = a/$;             // b = 받을 달러 
		
		System.out.println("받으실 달러는 "+ (b));
		
		sc.nextLine();
		// 숫자를 입력받고 다음 스캐너 사용시 sc.nextline(); 를 넣어주어야
		// 다음 입력받기 전까지 대기함.
		
		System.out.print("환전할 원화를 입력하세요: ");
		double c = sc.nextDouble();
		double d = c/$;
		System.out.println("받으실 달러는" + (d));
			
		sc.close();
		
	}

}
