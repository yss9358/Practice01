package com.javaex.practice;

import java.util.Scanner;

public class Ex33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		
		[Ex33.java]
				
	    사용자로부터 구의 반지름을 입력받아
	    구의 부피를 계산하는 프로그램을 작성하세요.
		
		구의 부피를 구하는 공식 
		
		V = 4/3 * pi * (r*r*r)
		
		V  : 구의부피
		pi : 3.14
		r  : 반지름		
		
		*/
		
		Scanner sc = new Scanner(System.in);
		
		final double pi = 3.14;
		
		System.out.print("반지름: ");	
		double r = sc.nextDouble();
		
		System.out.println("구의부피는: " + (double)4/3*pi*r*r*r +"입니다." );
		// (double)로 형변환을 해줘야 뒤의 값이 나옴 . 왜그런지는 물어봐야함.
				
		System.out.print("반지름: ");
		double R = sc.nextDouble();
		
		System.out.println("구의 부피는: " + (double)4/3*pi*R*R*R + "입니다.");

		sc.close();
		
	}

}
