package com.javaex.practice;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1, num2, s_num, b_num, d_num;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 숫자: ");
		num1 = sc.nextInt();
		System.out.print("두번째 숫자: ");
		num2 = sc.nextInt();
		
		if(num1 >= num2) {
			b_num = num1;
			s_num = num2;
			d_num = b_num%s_num;
		} else {
			b_num = num2;
			s_num = num1;
			d_num = b_num%s_num;
		}
		
		if (d_num == 0) {
			System.out.println(s_num + "는(은) " + b_num + " 의 약수입니다.");
		} else {
			System.out.println(s_num + "는(은) " + b_num + " 의 약수가 아닙니다.");
		}
	}

}
