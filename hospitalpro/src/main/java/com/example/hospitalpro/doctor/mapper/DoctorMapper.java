package com.example.hospitalpro.doctor.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DoctorMapper {
	@Insert("insert into end(end,d_id,r_id) values(#{end},#{doctor},#{regi})")
	void addend(String end, int doctor, int regi);
}
