package com.javaex.practice;

import java.util.Scanner;

public class Ex35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		
		[Ex35.java]
				
		long형 변수를 사용하여 빛이 1년동안 진행하는 거리를 계산하여 출력하세요.
		(단 빛의 속도는 300000 km/s 로 계산한다)
		
		*/
		
		Scanner sc = new Scanner(System.in);
		
		long a = 300000;   // 빛의 속력
		long b = 31556952; // 1년을 초로 변환 31556952초
				
		System.out.println("빛이 1년 동안 가는 거리는 " + a*b + " km 입니다." );
		
		sc.close();
		
	}

}
