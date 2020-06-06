package com.chinasoft.pojo;

public class Gender {
	private int id;
	private String name;
	private String teacher;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTeacher() {
		return teacher;
	}
	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}
	public Gender(int id, String name, String teacher) {
		super();
		this.id = id;
		this.name = name;
		this.teacher = teacher;
	}
	public Gender() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Gender [id=" + id + ", name=" + name + ", teacher=" + teacher + "]";
	}
	
}
