package com.javaex.practice;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double income, tax = 0;
		int cheak_num = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("수익을 입력해 주세요");
		System.out.print("수익: ");
		income = sc.nextDouble();
		
		if(income >= 0 && income <= 1000) {
			tax = 0.09*income;
		} else if(income > 1000 && income <= 4000) {
			tax = 0.09*1000 + 0.18*(income-1000);
		} else if(income > 4000 && income < 8000) {
			tax = 0.09*1000 + 0.18*3000 + 0.27*(income-4000);
		} else if(income >= 8000){
			tax = 0.09*1000 + 0.18*3000 + 0.27*4000 + 0.36*(income-8000);
		} else {
			cheak_num = 1;
			System.out.println("잘못 입력했습니다.");
		}
		if(cheak_num == 0) {
			System.out.println("소득세는 " + tax + " 입니다.");
		}
		

	}

}
