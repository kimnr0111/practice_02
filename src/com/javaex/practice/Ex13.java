package com.javaex.practice;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1;
		double result;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력해 주세요");
		System.out.print("숫자: ");
		num1 = sc.nextInt();
		
		if(num1 > 0) {
			result = (num1*num1*num1)-9*num1+2;
		} else {
			result = 7*num1+2;
		}
		
		System.out.println("계산결과는 " + result + " 입니다.");

	}

}
