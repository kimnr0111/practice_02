package com.javaex.practice;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Num1, Num2, b_num, s_num;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 2개를 입력해주세요");
		System.out.print("숫자1: ");
		Num1 = sc.nextInt();
		System.out.print("숫자2: ");
		Num2 = sc.nextInt();
		
		if(Num1 >= Num2) {
			b_num = Num1; 
			s_num = Num2;
		} else {
			b_num = Num2;
			s_num = Num1;
		}
		
		System.out.println("큰수: " + b_num + "\t\t 작은수: " + s_num + " 입니다.");
	}

}
