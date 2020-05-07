package com.javaex.practice;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char symbol;
		double num1, num2, result = 0; 
		int cheak_num = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("출력되는 내용을 입력하세요");
		System.out.print("기호: ");
		symbol = sc.next().charAt(0);
		System.out.print("숫자1: ");
		num1 = sc.nextDouble();
		System.out.print("숫자2: ");
		num2 = sc.nextDouble();
		
		if(symbol == '+') {
			result = num1 + num2;
		} else if(symbol == '-') {
			result = num1 - num2;
		} else if(symbol == '*') {
			result = num1 * num2;
		} else if(symbol == '/') {
			if(num2 == 0) {
				System.out.println("계산할 수 없습니다.");
				cheak_num = 1;
			} else {
				result = num1 / num2;
			}
		} else {
			System.out.println("계산할 수 없는 기호입니다.");
			cheak_num = 1;
		}
		if(cheak_num == 0) {
			System.out.println("결과는: " + result);
		}
	}

}
