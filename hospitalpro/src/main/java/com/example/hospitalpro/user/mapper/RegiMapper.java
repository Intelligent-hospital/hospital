package com.example.hospitalpro.user.mapper;

import java.sql.Date;
import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.example.hospitalpro.common.entity.Doctor;
import com.example.hospitalpro.common.entity.Patient;
import com.example.hospitalpro.common.entity.Regi;
import com.example.hospitalpro.common.entity.Work;

@Mapper
public interface RegiMapper {
	/*
	 * 挂号
	 */
	@Insert("insert into regi(`d_id`, `pa_id`, `time`) values(#{did},#{paid},#{datatime})")
	void registr(int did, int paid, Date datatime);

	/*
	 * 查询医生时间
	 */
	@Select("select d.doname,s.stations,price,w_id from doctor d,station s, work w where d.w_id=w.id and d.stat_id=s.id and d.id=#{id}")
	@Results(value = {
			@Result(column = "w_id", property = "work", javaType = Work.class, one = @One(select = "com.example.hospitalpro.user.mapper.WorkMapper.findbywork")) })
	public List<Doctor> findbywork(int id);

	/*
	 * 查询一个挂号
	 */
	@Select("select d_id,pa_id,time from regi where id=#{id}")
	@Results(id = "seregi", value = {
			@Result(column = "d_id", property = "doctor", javaType = Doctor.class, one = @One(select = "com.example.hospitalpro.user.mapper.PatientMapper.find")),
			@Result(column = "pa_id", property = "patient", javaType = Patient.class, one = @One(select = "com.example.hospitalpro.user.mapper.PatientMapper.findbypat")) })
	List<Regi> findallreg(int id);

	/*
	 * 查询签到挂号
	 */
	@Select("select id,d_id,pa_id,time,dense_rank() over(order by id) num from regi where time=#{datatime} and sign=1")
	@ResultMap(value = "seregi")
	List<Regi> findallregi(String datatime);

	/**
	 * 取消预约
	 * 
	 * @param id 就诊人id
	 */
	@Update("update Regi set isdelete=1 where id=#{id}")
	void cancelReservation(int id);

	/**
	 * 签到
	 * 
	 * @param id 就诊人id
	 */
	@Update("update Regi set sign=1 where id=#{id}")
	void sign(int id);
}
