package com.javaex.practice;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 나이가 20살 이상인 경우 1번그룹, 그 외에는 2번그룹으로 분류
		int age;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("나이를 입력해주세요");
		System.out.print("나이: ");
		age = sc.nextInt();
		
		if(age > 20) {
			System.out.println("\"1번그룹\"");
		} else {
			System.out.println("\'2번그룹\'");
		}
		System.out.println("입니다.");
		
		sc.close();

	}

}
