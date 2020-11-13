package com.example.hospitalpro.user.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Select;

import com.example.hospitalpro.common.entity.Dept;
import com.example.hospitalpro.common.entity.Doctor;
import com.example.hospitalpro.common.entity.Station;
import com.example.hospitalpro.common.entity.Uspass;
import com.example.hospitalpro.common.entity.Work;

@Mapper
public interface UserDoctorMapper {
	
	
	@Select("select * from doctor")
	@Results(id="detorMap",value = {
		@Result(column = "id",property = "id"),
		@Result(column = "doname",property = "name"),
		@Result(column = "dophone",property = "phone"),
		@Result(column = "do_sex",property = "sex"),
        /*   根据 部门id 查询部门信息  */
		@Result(
				column = "de_id",
				property = "dept",
				javaType = Dept.class,
				one = @One(select = "findByDeptId")),
		/* 根据 职位ID 查询职位信息 */
		@Result(
				column = "stat_id",
				property = "station",
				javaType = Station.class,
				one = @One(select = "findByStationId")),
		/* 根据 账号ID 查询 账号信息*/
		@Result(
				column = "us_id",
				property = "uspass",
				javaType = Uspass.class,
				one = @One(select = "findByStationId")),
		/* 根据工作时间ID 查询工作时间信息 */
		@Result(
				column = "w_id",
				property = "work",
				javaType = Work.class,
				one = @One(select = "findByWorkId")),
	     })
	public List<Doctor> findDoctorAll();

	
	/**
	 * 根据 科室ID 查询对应科室的所有医生
	 * @param dept_id
	 * @return
	 */
	@Select("select * from doctor where de_id = #{dept_id}")
	public List<Doctor> findByDeIdList(int dept_id);
	
	
	
	
	
	/**
	 * 根据 科室ID 查询 科室信息
	 */
	@Select("select * from dept where id = #{dept_id}")
	public Dept findByDeptId(int dept_id);
	
	/**
	 * 根据 职位ID 查询 职位信息
	 */
	@Select("select * from station where id = #{station_id}")
	public Station findByStationId(int station_id);
	
	
	/**
	 * 根据 账号ID 查询 账号信息
	 */
	@Select("select * from uspass where id = #{uspass_id}")
	public Uspass findByUspassId(int uspass_id);
	
	
	/**
	 * 根据 工作时间ID 查询工作时间
	 */
	@Select("select * from work where id = #{work_id}")
	public Work findByWorkId(int work_id);
	
	
}
