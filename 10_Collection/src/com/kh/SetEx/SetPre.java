package com.kh.SetEx;

import java.util.HashSet;

public class SetPre {
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<>();
		set.add("새우깡");
		set.add("고래밥");
		set.add("꽃게랑");
		set.add("맛동산");
		set.add("오징어땅콩");
		set.add("알새우칩");
		set.add("꽃게랑");
		set.add("꽃게랑");
		set.add("꽃게랑");

		System.out.println(set);
		
		System.out.println(set.size());// 크기 확인
		
		System.out.println(set.contains("맛동산")); //contains 사용해서 맛동산이 존재하는지 확인
		
		set.remove("고래밥");// 제거
		System.out.println(set);
		System.out.println(set.isEmpty());// 데이터가 모두 제거되었는지 확인
	}
}







