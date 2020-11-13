package com.example.hospitalpro.common.entity;

/*
 * 就诊人
 */
public class Patient {
	private int id;
	private String paname; // 名字
	private String paidCard; // 身份证
	private User user; // 用户可以添加多个
	private String sex;
	private int age;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPaname() {
		return paname;
	}

	public void setPaname(String paname) {
		this.paname = paname;
	}

	public String getPaidCard() {
		return paidCard;
	}

	public void setPaidCard(String paidCard) {
		this.paidCard = paidCard;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Patient [id=" + id + ", paname=" + paname + ", paidCard=" + paidCard + ", user=" + user + ", sex=" + sex
				+ ", age=" + age + "]";
	}

}
