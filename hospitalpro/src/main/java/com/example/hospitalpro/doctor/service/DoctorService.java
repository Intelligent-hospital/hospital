package com.example.hospitalpro.doctor.service;

import java.util.List;

import com.example.hospitalpro.common.entity.Doctor;
import com.example.hospitalpro.common.entity.Regi;

public interface DoctorService {
	/*
	 * 取消预约
	 */
	public String callback(int id);

	/*
	 * 当天排号
	 */
	public List<Regi> rownumber();

	/*
	 * 每个医生当天坐诊时间
	 */
	public List<Doctor> regifull(int id);
}
