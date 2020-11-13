package com.example.hospitalpro.user.mapper;

import java.sql.Date;
import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import com.example.hospitalpro.common.entity.Doctor;
import com.example.hospitalpro.common.entity.Patient;
import com.example.hospitalpro.common.entity.Regi;
import com.example.hospitalpro.common.entity.Work;

@Mapper
public interface RegiMapper {
//	挂号
	@Insert("insert into regi(`d_id`, `pa_id`, `time`) values(#{did},#{paid},#{datatime})")
	void registr(int did, int paid, Date datatime);

//	查询医生时间
	@Select("select d.doname,s.stations,price,w_id from doctor d,station s, work w where d.w_id=w.id and d.stat_id=s.id and d.id=#{id}")
	@Results(value = {
			@Result(column = "w_id", property = "work", javaType = Work.class, one = @One(select = "com.example.hospitalpro.user.mapper.WorkMapper.findbywork")) })
	public List<Doctor> findbywork(int id);

	// 查询挂号
	@Select("select d_id,pa_id,time from regi where id=#{id}")
	@Results(value = {
			@Result(column = "d_id", property = "doctor", javaType = Doctor.class, one = @One(select = "com.example.hospitalpro.user.mapper.PatientMapper.find")),
			@Result(column = "pa_id", property = "patient", javaType = Patient.class, one = @One(select = "com.example.hospitalpro.user.mapper.PatientMapper.findbypat")) })
	List<Regi> findallreg(int id);

}
