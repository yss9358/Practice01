package com.javaex.practice;

public class Ex17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		
		[Ex17.java]
		다음 코드의 오류가 나는 부분을 찾은 후 이유를 작성하세요.
		(코드를 작성해서 오류가 없도록 변경해 보세요.)
		
		public static void main(String[] args){
		
		  int x,y
		  
		  x = 10
		  y = 20 
		  
		  sum = x + y
		  
		  System.out.println("합은' + sum);
		  
		--------------------------------------------
		
		- 문자의 끝에 ; 를 붙여준다.
		- sum은 정수의 합이므로 int를 붙여준다.
		- 문자 그대로 결과값이 나오려면 " "  안에 원하는 문자를 넣어야한다.
		
		*/
		
		 int x,y;
		  
		  x = 10;
		  y = 20;
		  
		  int sum = x + y;
		  
		  System.out.println("합은" + sum);
		
	}

}
