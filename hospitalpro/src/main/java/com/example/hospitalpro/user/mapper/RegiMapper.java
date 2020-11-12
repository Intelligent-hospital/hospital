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
//	挂号
	@Insert("insert into regi(d_id,pa_id,time) values(#{doctor},#{patient},#{time})")
	Regi registr(Regi regi);

//	查询医生时间
	@Select("select d.name,s.stations,price,w_id from doctor d,station s, work w where d.w_id=s.id and d.stat_id=s.id")
	@Results(value = {
			@Result(column = "id", property = "work", javaType = Doctor.class, one = @One(select = "com.example.hospitalpro.user.mapper.findbywork")) })
	List<Doctor> findbywork();

}
