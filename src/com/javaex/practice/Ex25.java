package com.javaex.practice;

public class Ex25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		
		[Ex25.java]
		
		아래의 출력결과를 예상하여 작성하세요.
		(코드를 작성해서 예상과 맞는지 확인해 보세요.)
		
		public static void main(String[] args){
		
		  int a = 13;
		  
		 System.out.println( (a>13) && (a>=13) );
		 System.out.println( (a>13) || (a>=13) );
		 System.out.println( (a/3 == 4) && (a%3 == 2) );
		 System.out.println( (a/3 == 4) || (a%3 == 2) );
		 System.out.println( (a/3 == 4) && (a%3 == 2) || (a/3 == 4) );
		 	 
		}
		
		----------------------------------------------------------
		
		&& (AND 연산자) - 하나의 값이라도 false면 false
		|| (OR 연산자)  - 하나의 값이라도 true면 true
		! (NOT 연산자)  - 결과갑의 반대를 출력
		
		----------------------------------------------------
		
		예상
		
		(1) (a>13) && (a>=13)
		
		 -> (a>13) false, (a>=13) true 
		 -> false && true 이므로 false
		 
		(2) (a>13) || (a>=13)
		
		 -> (a>13) false, (a>=13) true
		 -> false || true 이므로 true
		 
		(3) (a/3 == 4) && (a%3 == 2)
		
		 -> (a/3 == 4) true, (a&3 == 2) false
		 -> true && false 이므로 false
		 
		(4) (a/3 == 4) || (a%3 == 2)
		
		 -> (a/3 == 4) true, (a%3 == 2) false
		 -> true || false 이므로 true
		 
		(5) (a/3 == 4) && (a%3 == 2) || (a/3 == 4)
		
		 -> (a/3 == 4) true, (a%3 == 2) false, (a/3 == 4) true
		 -> true && false || true
		 -> 연산자내에 || 가 있으면 하나라도 true 일시 결과값은 true
		
		-------------------------------------------------------
		
		결과값
		
		(1) false
		(2) true
		(3) false
		(4) true
		(5) true
		
		*/

		  int a = 13;
		  
			 System.out.println( (a>13) && (a>=13) );
			 System.out.println( (a>13) || (a>=13) );
			 System.out.println( (a/3 == 4) && (a%3 == 2) );
			 System.out.println( (a/3 == 4) || (a%3 == 2) );
			 System.out.println( (a/3 == 4) && (a%3 == 2) || (a/3 == 4) );
			 
	}

}
