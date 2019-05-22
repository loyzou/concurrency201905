package org.haoloy.main;

public enum EnumDemo {
	NAME1("name1","男"),
	NAME2("name2","女");
	
	private String name;
	private String gender;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	EnumDemo(String name,String gender){
		this.name = name;
		this.gender = gender;
	}
	public static void main(String[] args) {
		EnumDemo.NAME1.getGender();
	}
}
