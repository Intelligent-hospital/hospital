package com.example.hospitalpro.doctor.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.hospitalpro.common.entity.Regi;

@Service
public interface DoctorService {
	/*
	 * 排号
	 */
	List<Regi> rownumber();
}
