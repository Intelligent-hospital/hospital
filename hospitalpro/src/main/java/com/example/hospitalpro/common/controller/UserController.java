package com.example.hospitalpro.common.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.hospitalpro.common.entity.Doctor;
import com.example.hospitalpro.common.entity.Patient;
import com.example.hospitalpro.common.entity.Regi;
import com.example.hospitalpro.user.mapper.RegiMapper;

@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	RegiMapper regiMapper;

//	挂号
	@PostMapping("/doctor/registration")
	public Regi addregi(@RequestBody Regi regi, @RequestBody Doctor doctor, @RequestBody Patient patient) {
		regi.setDoctor(doctor);
		regi.setPatient(patient);
		return regiMapper.registr(regi);
	}

//	查询医生时间
	@GetMapping("/doctor/time")
	public List<Doctor> show() {
		return regiMapper.findbywork();
	}
}
