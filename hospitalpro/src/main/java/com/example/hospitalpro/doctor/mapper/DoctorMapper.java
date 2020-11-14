package com.example.hospitalpro.doctor.mapper;

import java.sql.Date;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface DoctorMapper {
	@Insert("insert into end(end,d_id,r_id) values(#{end},#{doctor},#{regi})")
	void addend(String end, int doctor, int regi);

	@Select("select count(*) from regi where time=#{time} and d_id=#{id} and isdelete=0")
	int regicount(Date time, int id);

}
