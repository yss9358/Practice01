package com.javaex.practice;

public class Ex20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		
		[Ex20.java]
		아래의 출력결과를 예상하여 작성하세요.
		(코드를 작성해서 예상과 맞는지 확인해 보세요.)
		
		public static void main(String[] args){
		
		  int i = 10;
		  int n = i++ %2;
		  
		  System.out.println(i);
		  System.out.println(n);
		  
		 -------------------------------------------
		 
		예상
		 
		(1) System.out.println(i);
		
		 -> 10
		
		(2) System.out.println(n);
		
		 -> 5
		
		--------------------------------------------
		
		결과값
		
		(1) 11
		(2) 0
		
		-> (2) 계산중 %를 /와 혼동하여 5로 계산하게 됨.
		
		-> i++ 는 출력후에 증가값으로 변환되어저장되므로 10이 먼저 출력됨.
		-> i++ %2 
		-> 10 % 2 = 0
		-> 0 의 결과값을 도출해야함.
		
		*/
		int i = 10;
		  int n = i++ %2;
		  
		  System.out.println(i);
		  System.out.println(n);
		  
	}

}
