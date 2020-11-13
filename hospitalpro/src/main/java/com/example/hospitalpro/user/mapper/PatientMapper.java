package com.example.hospitalpro.user.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

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
	@Insert("insert into patient(u_id,paname,paidCard) values(1,#{paname},#{paidCard})")
	void addPatient(Patient patient);

	/**
	 * 取消预约
	 * 
	 * @param id 就诊人id
	 */
	@Update("update Regi set isdelete=1 where id=#{id}")
	void cancelReservation(int id);
}
