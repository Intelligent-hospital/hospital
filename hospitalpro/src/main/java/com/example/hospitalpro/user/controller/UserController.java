package com.example.hospitalpro.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.hospitalpro.common.entity.Dept;
import com.example.hospitalpro.common.entity.Doctor;
import com.example.hospitalpro.user.mapper.UserDeptMapper;
import com.example.hospitalpro.user.mapper.UserDoctorMapper;

@RestController
@RequestMapping("/user")
public class UserController {
	
	/**
	 * 依赖注入 医生持久层
	 */
	@Autowired
	UserDoctorMapper doctorMapper;
	
   /**
    * 依赖注入 科室持久层
    */
	UserDeptMapper deptMapper;
	
	
	/**
	 * 获取所有医生
	 * @return
	 */
	@GetMapping("/doctor")
	public List<Doctor> findByAll(){
		return doctorMapper.findDoctorAll();
	}
	
	
	/**
	 * 获取所有科室
	 */
	@GetMapping("/office")
	public List<Dept> findByDepts(){
		return deptMapper.findAll();
	}
	
	/**
	 * 根据 科室ID 获取该科室所有医生
	 */
	@GetMapping("/{dept_id}/doctor")
	public List<Doctor> findByDeptId(
			@PathVariable int dept_id){
		return doctorMapper.findByDeIdList(dept_id);
	}
	
	
}
