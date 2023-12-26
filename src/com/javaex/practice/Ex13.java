package com.javaex.practice;

public class Ex13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		
		[Ex13.java]
		
		다음중 결과값이 다른 것을 선택하고 이유를 설명해 보세요.
		
		public static void main(String[] args){
		
		 System.out.println(13/5);                  // (1)
		 System.out.println((double)13/5);          // (2)
		 System.out.println(13/(double)5);          // (3)
		 System.out.println((double)13/(double)5);  // (4)
		 System.out.println(13.0/5);                // (5)
		 System.out.println(13/5.0);                // (6)
		 System.out.println((double)(13/5));        // (7)
		 
		 ---------------------------------------------------
		 
		 (1) 2
		 
		  -> (1)번 식은 13/5의 값인 2가 정수형으로 나온다.
         (2) 2.6
         (3) 2.6
         (4) 2.6
         
           -> (2)~(4)번 식은 실수형으로 형변환이 되어 2.6의 결과값이 나온다.
         
         (5) 2.6
         (6) 2.6
         
          -> (5),(6)번 식은 실수가 포함된 계산으로 2.6이 나온다.
         
         (7) 2.0
         
          -> (7)번 식은 정수형으로 계산되어 나온 값을 실수형으로 형변환해 2.0의 결과값이 나온다.

		*/
		
	}

}
