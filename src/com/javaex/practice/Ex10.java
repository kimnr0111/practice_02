package com.javaex.practice;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int my_num, t_num;
		String team;
		Scanner sc = new Scanner(System.in);
		System.out.println("사번(정수)를 입력해주세요");
		System.out.print("사번: ");
		my_num = sc.nextInt();
		
		t_num = my_num%3;
		
		switch(t_num) {
		case 0:
			team = "A팀입니다.";
			break;
		case 1:
			team = "B팀입니다.";
			break;
		case 2:
			team = "C팀입니다.";
			break;
		default:
			team = "잘못입력하셨습니다.";
			break;
		}
		
		System.out.println(team);
		
		

	}

}
