package com.javaex.practice;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 15;
		
		//age가 0살 초과이고 18살 미만 이면
		//(0 < age < 18) --> (0 < age && 18 > age) 수정
		if(0 < age && 18 > age) {
			System.out.println("청소년 입니다.");
		}

	}

}
