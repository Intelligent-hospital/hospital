package com.example.hospitalpro.user.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.example.hospitalpro.common.entity.Work;

@Mapper
public interface WorkMapper {
//	查询所有时间
	@Select("select * from work where id=#{id}")
	Work findbywork(int id);
}
