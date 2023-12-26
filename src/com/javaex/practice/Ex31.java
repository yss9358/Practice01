package com.javaex.practice;

import java.util.Scanner;

public class Ex31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		
		[Ex31.java]
				
		상품을 구매하면 정가의 10%를 부가세로 부여한다. 
		아래와 같이 출력되도록 프로그램을 작성하세요
		
		*/
		
		Scanner sc = new Scanner(System.in);
		
		final double a = 0.10;
		
		System.out.print("상품가격: ");
		double b = sc.nextDouble();

		System.out.print("받은돈: ");
		double c = sc.nextDouble();
		
		System.out.println("=================");
		System.out.println("받은돈: "+c);
		System.out.println("상품가격: "+b);
		System.out.println("부가세: "+(a*b));
		System.out.println("잔액: "+(c-b));
		
		sc.close();
		
	}

}
