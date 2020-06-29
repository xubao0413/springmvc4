package com.bjsxt.pojo;

public class People {

	@Override
	public String toString() {
		return "People [age=" + age + ", name=" + name + "]";
	}
	private int age;
	private String name;
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
