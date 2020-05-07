package com.javaex.practice;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1, num2, num3, s_num;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자 3개를 입력해주세요");
		System.out.print("숫자1: ");
		num1 = sc.nextInt();
		System.out.print("숫자2: ");
		num2 = sc.nextInt();
		System.out.print("숫자3: ");
		num3 = sc.nextInt();
		
		if(num1 >= num2) {
			if(num2 >= num3) {
				s_num = num3;
			} else {
				s_num = num2;
			}
		} else {
			if(num1 >= num3 ) {
				s_num = num3;
			} else {
				s_num = num1;
			}
		}

		
		System.out.println("가장 작은수는 " + s_num + " 입니다.");
	}

}
