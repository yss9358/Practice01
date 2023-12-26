package com.javaex.practice;

public class Ex16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		
		[Ex16.java]
		아래 프로그램의 결과를 코드작성전에 먼저 예상해보고 코드를 작성해 확인해 보세요.
		
		public static void main(String[] args){
		
		  int x = 1;
		  int y = 1;
		  
		  int a = ++x *2;
		  int b = y++ *2;
		  
		  System.out.println("a=" + a);
		  System.out.println("b=" + a);
		  System.out.println("x=" + a);
		  System.out.println("y=" + a);
		  
		-----------------------------------------------------
		
		예상 
		
		(1) "a=" + a 
		
		 -> "a="는 문자로 출력
		 ->  a = ++x *2 
		 ->  a = 2 * 2 = 4 
		 ->  a=4 예상
		 
		(2) "b=" + a
		
		 -> "b="는 문자로 출력
		 -> a = ++x *2
		 -> a = 2 * 2 = 4
		 -> b=4 예상
		 
		(3) "x=" + a
		
		 -> "x="는 문자로 출력
		 -> a = ++x *2
		 -> a = 2 * 2 = 4
		 -> x=4 예상
		 
		(4) "y=" +a
		
		 -> "y="는 문자로 출력
		 -> a = ++x *2
		 -> a = 2 * 2 = 4
		 -> y=4 예상
		
		-----------------------------------
		
		결과값
		
		a=4
		b=4
		x=4
		y=4
		
		*/
		
		  int x = 1;
		  int y = 1;
		  
		  int a = ++x *2;
		  int b = y++ *2;
		  
		  System.out.println("a=" + a);
		  System.out.println("b=" + a);
		  System.out.println("x=" + a);
		  System.out.println("y=" + a);
		  
	}

}
