package com.javaex.practice;

public class Ex21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		
		[Ex21.java]
		아래의 출력결과를 예상하여 작성하세요. Ex20문제와 어느 부분이 다른지 비교해 보세요.
		(코드를 작성해서 예상과 맞는지 확인해 보세요.)
		
		public static void main(String[] args){
		
		 int i = 10;
		 int n = ++i %2;
		 
		 System.out.println(i);
		 System.out.println(n);
		 
		--------------------------------
		
		예상 
		
		(1) System.out.println(i);
		
		 -> 10 예상
		 
		(2) System.out.println(n);
		
		 -> int n = ++i %2;
		 -> ++i 의 경우 i = 10에서 먼저 변수값을 증가시키고 계산한 후에 출력됨
		  ( 20번 문제와 다른점 )
		 -> int n = 11 %2 = 1
		 
		-> 1 예상
		
		--------------------------------------
		
		결과값
		
		(1) 11
		(2) 1
		
		
		(1) 왜 10이아닌 11이 나오는지 모르겠음. 
		-> (1) 번 식이 먼저 출력되고 (2)번식이 출력되는 방식이 아닌지?..
		-> 변수 n 이 먼저 저장되고 난 후에 출력을 진행해서 i 가 11이 나오는거 같다..? 
		
		*/
		
		int i = 10;
		int n = ++i %2;
		
		System.out.println(i);
		System.out.println(n);

	}

}
