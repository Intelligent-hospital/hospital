package com.example.hospitalpro.common.entity;

/*
 * 用户
 */
public class User {
	private int id;
	private String name;
	private String idCard;
	private String phone;
	private String address;
	private Uspass uspass; // 账号密码表账号密码

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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Uspass getUspass() {
		return uspass;
	}

	public void setUspass(Uspass uspass) {
		this.uspass = uspass;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

}
