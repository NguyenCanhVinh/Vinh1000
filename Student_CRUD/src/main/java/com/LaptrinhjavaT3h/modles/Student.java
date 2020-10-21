package com.LaptrinhjavaT3h.modles;

public class Student {
	private String id;
	private String fullname;
	private String class;
	private int age;
	private boolean gender;
	public Student() {
		super();
	}
	public student(String id, String fullname, String class, int age, boolean gender) {
		super();
		this.id = id;
		this.fullname = fullname;
		this.class = class;
		this.age = age;
		this.gender = gender;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
        public String getClass() {
		return class;
	}
	public void setClass(String class) {
		this.class = class;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean isGender() {
		return gender;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
   
}
