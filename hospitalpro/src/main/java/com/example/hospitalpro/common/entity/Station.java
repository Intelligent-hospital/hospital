package com.example.hospitalpro.common.entity;

import java.math.BigDecimal;

public class Station {
	private String stations;
	private BigDecimal price;

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
