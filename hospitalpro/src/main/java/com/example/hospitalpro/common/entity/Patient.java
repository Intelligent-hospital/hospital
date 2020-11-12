package com.example.hospitalpro.common.entity;

/*
 * 就诊人
 */
public class Patient {
	private int id;
	private String name; // 名字
	private String idCard; // 身份证
	private User user; // 用户可以添加多个

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

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}

}
