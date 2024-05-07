package com.kh.oop.method.ex;

public class IceCream {
//필드
	private String name;
	private int suger;
	private boolean milk;
//메서드
	//Setter
	
	public void setName(String name) {
		this.name = name;
	}
	public void setSuger(int suger) {
		this.suger = suger;
	}
	public void setMilk(boolean milk) {
		this.milk = milk;
	}
	//Getter
	public String getName() {
		return name;
	}
	public int getSuger() {
		return suger;
	}
	public boolean isMilk() {
		return milk;
	}
	//생성자 : 기본
	public IceCream() {
		
	}
	//생성자 : 필수 이름 설탕 우유 유무
	public IceCream(String name, int suger, boolean milk) {
		this.name = name;
		this.suger = suger;
		this.milk = milk;
	}
	
	public void makeIceCream(){ 
		System.out.println("이름 : " + name);
		System.out.println("설탕 : " + suger);
		//우유 추가 미추가
		if(milk) {
			System.out.println("우유 추가");
		} else {
			System.out.println("우유 미추가");
		}
	}
//IceCreamRun -> 메인메서드
	
}
