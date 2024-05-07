package com.kh.StackEx;

import java.util.Stack;

public class StackPre {
	//main 메인메서드 에서 작성
	public static void main(String[] args) {
		// Stack 	을 활용해서 10 30 50 40 20 을 넣고 push 사용
		Stack<Integer> 스택 = new Stack<>();
		
		스택.push(10);
		스택.push(30);
		스택.push(50);
		스택.push(40);
		스택.push(20);
		System.out.println(스택);
		// pop 		맨 위 값을 지우고 반환해서 확인
		int 탑 = 스택.pop();
		System.out.println(탑);
		// peek 	현재 맨 위 값 확인
		int 맨위값확인 = 스택.peek();
		System.out.println(맨위값확인);
		// isEmpty  비어있는지 확인
		boolean 비어있나요 = 스택.isEmpty();
		System.out.println(비어있나요);
		// size		크기는 몇인지 확인
		System.out.println(스택.size());
	}

}







