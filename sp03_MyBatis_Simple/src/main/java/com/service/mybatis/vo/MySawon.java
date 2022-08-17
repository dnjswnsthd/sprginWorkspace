package com.service.mybatis.vo;

public class MySawon {
	private int num, age; // 컬럼명과 동일
	private String id, pwd, name, hiredate; // 컬럼명과 동일

	public MySawon() {
		super();
	}

	public MySawon(int num, int age, String id, String pwd, String name, String hiredate) {
		super();
		this.num = num;
		this.age = age;
		this.id = id;
		this.pwd = pwd;
		this.name = name;
		this.hiredate = hiredate;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHiredate() {
		return hiredate;
	}

	public void setHiredate(String hiredate) {
		this.hiredate = hiredate;
	}

	@Override
	public String toString() {
		return "MySawon [num=" + num + ", age=" + age + ", id=" + id + ", pwd=" + pwd + ", name=" + name + ", hiredate="
				+ hiredate + "]";
	}

}