package com.biz.euler;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1st = 1;
		int num2nd = 2;
		int fibNum = num2nd;
		int intSum = 0;
		System.out.println(num1st);
		System.out.println(num2nd);
		intSum = num2nd;
		while(true) {
			fibNum = num1st + num2nd;
			
			if(fibNum > 1000) break;
			
			System.out.println(fibNum);
			
			num1st = num2nd;
			num2nd = fibNum;
			
			if(fibNum % 2 ==0)
				
			intSum += fibNum;
			
		}
		System.out.println("1000이하 피보나치 수열중 짝수들의 합 : " + intSum);
	}

}
