package com.example.hospitalpro.user.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.example.hospitalpro.common.entity.Work;

@Mapper
public interface WorkMapper {
	@Select("select * from work")
	List<Work> findwork();
}
