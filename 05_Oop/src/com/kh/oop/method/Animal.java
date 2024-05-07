package com.kh.oop.method;

public class Animal {
//필드
	public String name;
	public int age;
	
//메서드
	//생성자
	// 기본
	public Animal() {
	}
	// 필수 name age
	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	//return
	public String getName() {
		return name;
	}
	
	// return 으로 나이 받기
	public int getAge() { //int
		return age;
		
	}
	
	// void 로 프린트 출력하기
	public void info() {
		System.out.println("동물 이름 :" + name);
		System.out.println("동물 나이 : " + age);
	}
	
	
	//메인메서드
	public static void main(String[] args) {
		//동물 변수명 = dog ("강아지",1);
		Animal dog = new Animal("강아지",1);
		Animal cat = new Animal("고양이",1);
		
		dog.info();
		cat.info();

	}

}









