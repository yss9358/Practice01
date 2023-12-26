package com.javaex.practice;

public class Ex15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		
		[Ex15.java]
		아래 프로그램의 결과를 코드작성전에 먼저 예상해보고 코드를 작성해 확인해 보세요.
		
		public static void main(String[] args){
		
		  System.out.println( 12 / 5-3 );
		  System.out.println( 5 + 19 % 3 );
		  System.out.println( 2 + 2 / 2 );
		  System.out.println( 29 % 3 + 29 / 3 );
		  System.out.println( 25 % 3 + 18.0 / 4 );
		  System.out.println( (14 + 7 / 2 ) / 4 );
		  System.out.println( (14 + 7 / 2.0) / 5 );
		  
		-----------------------------------------------
		예상
		
		(1) 12 / 5 - 3
		
		 -> 12 / 5 = 2 
		 -> 2 - 3 = -1
		 -> -1 예상

	    (2) 5 + 19 % 3 
	    
	     -> 19 % 3 = 1
	     -> 5 + 1 = 6
	     -> 6 예상
	    
	    (3) 2 + 2 / 2 
	    
	     -> 2 / 2 = 1
	     -> 2 + 1 = 3
	     -> 3 예상
	     
	    (4) 29 % 3 + 29 / 3
	    
	     -> 29 % 3 = 2
	     -> 29 / 3 = 9
	     -> 2 + 9 = 11
	     -> 11 예상
	     
	    (5) 25 % 3 + 18.0 / 4
	    
	     -> 25 % 3 = 1
	     -> 18.0 / 4 = 4.5
	     -> 1 + 4.5 = 5.5
	     -> 5.5 예상
	     
	    (6) (14 + 7 / 2) / 4
	    
	     -> 7 / 2 = 3
	     -> 14 + 3 = 17
	     -> 17 / 4 = 1
	     -> 4 예상
		
		(7) (14 + 7 / 2.0 ) / 5
		
		 -> 7 / 2.0 = 3.5
		 -> 14 + 3.5 = 17.5
		 -> 17.5 / 5 = 3 
		 -> 3 예상
		
		-----------------------------
		
		결과값
		
		(1) -1
		(2) 6
		(3) 3
		(4) 11
		(5) 5.5
		(6) 4
		(7) 3.5
		
		-> 7번 17.5 / 5 에서 실수형계산을 해야하는데 정수형계산으로 실수함.
		
		*/
		
		System.out.println( 12 / 5-3 );
		  System.out.println( 5 + 19 % 3 );
		  System.out.println( 2 + 2 / 2 );
		  System.out.println( 29 % 3 + 29 / 3 );
		  System.out.println( 25 % 3 + 18.0 / 4 );
		  System.out.println( (14 + 7 / 2 ) / 4 );
		  System.out.println( (14 + 7 / 2.0) / 5 );

	}

}
