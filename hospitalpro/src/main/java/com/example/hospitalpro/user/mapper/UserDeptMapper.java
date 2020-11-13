package com.example.hospitalpro.user.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.example.hospitalpro.common.entity.Dept;

@Mapper
public interface UserDeptMapper {
	
	/**
	 * 查询所有科室
	 * @return
	 */
	@Select("select * from dept")
	public List<Dept> findAll();
	

}
