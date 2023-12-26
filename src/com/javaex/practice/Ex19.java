package com.javaex.practice;

public class Ex19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		
		[Ex19.java]
		아래 프로그램의 결과를 코드작성전에 먼저 예상해보고 코드를 작성해 확인해 보세요.
		
		public static void main(String[] args){
		
		 int num01 = 40;
		 int num02 = 50;
		 int result = (num01++) + (++num02);
		 
		 System.out.println(result);
		 System.out.println(num01);
		 System.out.println(num02);
		
		-------------------------------------
		
		예상
		
		(1) System.out.println(result);
		
		 -> (num01++) + (++num02)
		 -> 40 + 51
		 -> 91 예상
		 
		(2) System.out.println(num01);
		
		 -> (1) 에서 계산후에 증가가 되어서 41 예상
		
		(3) System.out.println(num02);
		
		 -> (1) 에서 증가후에 계산되어서 51예상
		 
		---------------------------------
		
		결과값
		
		91
		41
		51
		
		*/
		
		int num01 = 40;
		 int num02 = 50;
		 int result = (num01++) + (++num02);
		 
		 System.out.println(result);
		 System.out.println(num01);
		 System.out.println(num02);
		
	}

}
