package com.example.hospitalpro.doctor.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.hospitalpro.common.entity.Regi;
import com.example.hospitalpro.user.mapper.RegiMapper;

public class DoctorServiceImpl implements DoctorService {
	@Autowired
	RegiMapper regimapper;

	@Override
	public List<Regi> rownumber() {
		List<Regi> regi = regimapper.findallregi();
		return regi;
	}

}
