package com.example.hospitalpro.common.entity;

/*
 * 就诊人
 */
public class Patient {
	private String name; // 名字
	private String idCard; // 身份证

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

	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}

}
