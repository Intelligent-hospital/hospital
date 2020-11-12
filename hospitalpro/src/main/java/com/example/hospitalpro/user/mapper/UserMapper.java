package com.example.hospitalpro.user.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

import com.example.hospitalpro.common.entity.Regi;

@Mapper
public interface UserMapper {
	// 挂号
	@Insert("insert into regi(d_id,pa_id,time) values(#{d_id},#{pa_id},#{time})")
	List<Regi> registr(Regi regi);

}
