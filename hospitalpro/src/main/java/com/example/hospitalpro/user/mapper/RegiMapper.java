package com.example.hospitalpro.user.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import com.example.hospitalpro.common.entity.Doctor;
import com.example.hospitalpro.common.entity.Regi;

@Mapper
public interface RegiMapper {
	// 挂号
	@Insert("insert into regi(d_id,pa_id,time) values(#{d_id},#{pa_id},#{time})")
	Regi registr(Regi regi);

	// 查询医生工作时间及其它
	@Select("select name,stations,price,w_id from doctor d,station s,work w where d.stat_id=s.id and d.w_id=w.id")
	@Results(value = {
			@Result(column = "w_id", property = "work", javaType = Doctor.class, one = @One(select = "com.example.hospitalpro.user.mapper.findwork")) })
	List<Doctor> findbywork();

}
