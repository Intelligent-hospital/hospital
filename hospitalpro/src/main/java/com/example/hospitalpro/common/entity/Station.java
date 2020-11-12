package com.example.hospitalpro.common.entity;

import java.math.BigDecimal;

/*
 * 职位
 */
public class Station {
	private String stations; // 具体职位
	private BigDecimal price; // 价格

	public String getStations() {
		return stations;
	}

	public void setStations(String stations) {
		this.stations = stations;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public Station() {
		super();
		// TODO Auto-generated constructor stub
	}

}
