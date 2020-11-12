package com.example.hospitalpro.common.entity;

/*
 * 科室表
 */
public class Dept {
	private int id;
	private String name; // 科室名
	private String synopsis; // 科室详情

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

	public String getSynopsis() {
		return synopsis;
	}

	public void setSynopsis(String synopsis) {
		this.synopsis = synopsis;
	}

	public Dept() {
		super();
		// TODO Auto-generated constructor stub
	}

}
