package com.example.hospitalpro.common.entity;

/*
 * 就诊人
 */
public class Patient {
	private int id;
	private String name; // 名字
	private String idCard; // 身份证
	private String age;
	private String sex;

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

	public String getIdCard() {
		return idCard;
	}

	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}

}
