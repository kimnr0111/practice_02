package com.javaex.practice;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Num1, Num2, b_num, s_num, div, rest;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 숫자: ");
		Num1 = sc.nextInt();
		System.out.print("두번째 숫자: ");
		Num2 = sc.nextInt();
		
		if(Num1 >= Num2) {
			b_num = Num1; 
			s_num = Num2;
		} else {
			b_num = Num2;
			s_num = Num1;
		}
		
		div = b_num/s_num;
		rest = b_num%s_num;
		
		System.out.println("몫: " + div + "\n나머지: " + rest);
	}

}
