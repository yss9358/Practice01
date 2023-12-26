package com.javaex.practice;

import java.util.Scanner;

public class Ex26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		
		[Ex26.java]
		
	    월급을 입력받아 10년동안 최대 저축액을 계산하는 프로그램을 작성하세요.
		
		월급을 입력하세요: 200
		10년동안 최대 저축액은 24000원 입니다.
		
		---------------------------------------------
		
		public static void main(String[] args){
			
		- Scanner sc = new Scanner(System.in); 을 입력하면
		  Scanner가 입력되고 왼쪽에 에러표시가 뜨고 import로 추가.
		
		- 입력받은다음 변수 = sc.nextInt(); 로 입력받은 값을 변수지정
		- 마지막 sc.close(); 를 작성해 스캐너 입력 마무리
		
		*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("월급을 입력하세요: ");
		System.out.print("월급: ");
		int money = sc.nextInt();
		
		System.out.println("10년동안 최대 저축액은 "+(money*12*10)+" 입니다.");
		
		sc.close();
		
	}

}
