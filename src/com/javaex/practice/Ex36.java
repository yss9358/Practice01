package com.javaex.practice;

import java.util.Scanner;

public class Ex36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		
		[Ex36.java]
		
		동전별 개수를 입력받아 총금액을 계산하는 프로그램을 작성하세요.
		
		*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("500원 개수: ");
		int a = 500*sc.nextInt();
		
		System.out.print("100원 개수: ");
		int b = 100*sc.nextInt();
		
		System.out.print("50원 개수: ");
		int c = 50*sc.nextInt();
		
		System.out.print("10원 개수: ");
		int d = 10*sc.nextInt();
		
		System.out.println("동전의 총합은 " + (a+b+c+d) + " 원 입니다.");
		
		
		System.out.print("500원 개수: ");
		int a1 = 500*sc.nextInt();
		
		System.out.print("100원 개수: ");
		int b1 = 100*sc.nextInt();
		
		System.out.print("50원 개수: ");
		int c1 = 50*sc.nextInt();
		
		System.out.print("10원 개수: ");
		int d1 = 10*sc.nextInt();
		
		System.out.println("동전의 총합은 " + (a1+b1+c1+d1) + " 원 입니다.");
		
		sc.close();
	
	}

}
