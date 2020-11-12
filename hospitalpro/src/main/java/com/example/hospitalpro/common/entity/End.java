package com.example.hospitalpro.common.entity;

import java.sql.Date;

/*
 * 病历单
 */
public class End {
	private int id;
	private String end; // 病历详情
	private Date savetime; // 保存时间
	private Doctor doctor; // 医生id查询病历
	private Regi regi; // 挂号id查询病历

	public Doctor getDoctor() {
		return doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

	public Regi getRegi() {
		return regi;
	}

	public void setRegi(Regi regi) {
		this.regi = regi;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEnd() {
		return end;
	}

	public void setEnd(String end) {
		this.end = end;
	}

	public Date getSavetime() {
		return savetime;
	}

	public void setSavetime(Date savetime) {
		this.savetime = savetime;
	}

	public End() {
		super();
		// TODO Auto-generated constructor stub
	}

}
