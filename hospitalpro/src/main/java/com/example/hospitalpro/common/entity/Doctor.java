package com.example.hospitalpro.common.entity;

/*
 * 医生
 */
public class Doctor {
	private int id;
	private String doname;
	private String dophone;
	private String sex;
	private Dept dept; // 所属部门
	private Uspass uspass; // 账号密码
	private Station station; // 职位
	private Work work; // 工作时间

	public String getDoname() {
		return doname;
	}

	public void setDoname(String doname) {
		this.doname = doname;
	}

	public String getDophone() {
		return dophone;
	}

	public void setDophone(String dophone) {
		this.dophone = dophone;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Dept getDept() {
		return dept;
	}

	public void setDept(Dept dept) {
		this.dept = dept;
	}

	public Uspass getUspass() {
		return uspass;
	}

	public void setUspass(Uspass uspass) {
		this.uspass = uspass;
	}

	public Station getStation() {
		return station;
	}

	public void setStation(Station station) {
		this.station = station;
	}

	public Work getWork() {
		return work;
	}

	public void setWork(Work work) {
		this.work = work;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}

}
