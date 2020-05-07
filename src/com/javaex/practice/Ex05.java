package com.javaex.practice;

import java.util.Scanner;

public class Ex05 {
	
	public static void main(String[] args) {
		double height, weight, std_weight;
		String fat;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("키와 몸무게를 입력해주세요");
		System.out.print("키: ");
		height = sc.nextDouble();
		System.out.print("몸무게: ");
		weight = sc.nextDouble();
		
		std_weight = (height-100)*0.9;
		if(weight > std_weight) {
			fat = "과체중";
		} else if(weight < std_weight) {
			fat = "저체중";
		} else {
			fat = "표준";
		}
		
		System.out.println(fat + " 입니다.");
	}

}
