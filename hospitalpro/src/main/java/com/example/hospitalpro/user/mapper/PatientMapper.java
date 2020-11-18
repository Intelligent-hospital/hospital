package com.example.hospitalpro.user.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.example.hospitalpro.common.entity.Doctor;
import com.example.hospitalpro.common.entity.Patient;

@Mapper
public interface PatientMapper {
	@Select("select id,paname,paidCard,sex,age from patient where id=#{id}")
	Patient findbypat(int id);

	@Select("select id,doname from doctor where id=#{id}")
	Doctor find(int id);

	/**
	 * 查询所有就诊人
	 */
	@Select("select * from patient")
	List<Patient> findAllPatient();

	/**
	 * 添加就诊人
	 * 
	 * @param patient
	 */
	@Insert("insert into patient(u_id,paname,paidCard,sex,age) values(#{user.id},#{paname},#{paidCard},#{sex},#{age})")
	void addPatient(Patient patient);

	@Delete("delete from patient where id=#{id}")
	void deletepat(int id);

}
