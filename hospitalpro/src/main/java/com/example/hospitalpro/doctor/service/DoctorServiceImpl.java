package com.example.hospitalpro.doctor.service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hospitalpro.common.entity.Doctor;
import com.example.hospitalpro.common.entity.End;
import com.example.hospitalpro.common.entity.Regi;
import com.example.hospitalpro.doctor.mapper.DoctorMapper;
import com.example.hospitalpro.user.mapper.RegiMapper;

@Service
public class DoctorServiceImpl implements DoctorService {
	@Autowired
	RegiMapper regimapper;
	@Autowired
	DoctorMapper doctormapper;
	static List<String> list = new ArrayList();
	static int num = -1;

	@Override
	public String callback(int id) {
		SimpleDateFormat df = new SimpleDateFormat("yyyyMMdd");
		Regi regi = regimapper.findallreg(id);
		if (regi == null) {
			return "您输入的挂号编号未查到";
		}
		String regitime = df.format(regi.getTime());
		String nowtime = df.format(new Date());
		if (regitime.equals(nowtime)) {
			return "当日挂号不可取消";
		} else {
			regimapper.cancelReservation(id);
			return "预约成功取消";
		}
	}

	@Override
	public List<Regi> rownumber() {
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		String datatime = df.format(new Date());
		List<Regi> regi = regimapper.findallregi(datatime);
		return regi;
	}

	@Override
	public List<Doctor> regifull(int id) {
//		List<Doctor> work = regimapper.findbywork(id);
//		if (work.get(0).getWork().getFriam() == 1) {
//
//		}

		return null;
	}

	@Override
	public String addregistr(Regi regi) {
		int num = doctormapper.regicount(regi.getTime(), regi.getDoctor().getId());
		if (num < 5) {
			java.sql.Date datatime = regi.getTime();
			int did = regi.getDoctor().getId();
			int paid = regi.getPatient().getId();
			int id = regi.getId();
			regimapper.registr(id, did, paid, datatime);
			return "挂号成功";
		} else {
			SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
			java.sql.Date time = regi.getTime();
			String datatime = df.format(time);
			return String.format("对不起,%s的号已挂完,请选择其它日期", datatime);
		}
	}

	@Override
	public String signregistr(int id) {
		SimpleDateFormat df = new SimpleDateFormat("yyyyMMdd");
		Regi regi = regimapper.findallreg(id);
		if (regi == null) {
			return "您输入的挂号编号未查到";
		}
		String regitime = df.format(regi.getTime());
		String nowtime = df.format(new Date());
		if (regitime.equals(nowtime)) {
			regimapper.sign(id);
			System.out.println("list" + id);
			list.add(String.valueOf(id));
			return "签到成功";
		} else {
			return "只有当日可以签到";
		}
	}

	/*
	 * 叫号
	 */
	@Override
	public Regi subend(End end) {
		doctormapper.addend(end.getEnd(), end.getDoctor().getId(), end.getRegi().getId());
		regimapper.statureg(end.getRegi().getId());
		num++;
		System.out.println("num:" + num);
		if (num > 4) {
			System.out.println("listsize:" + list.size());
			list = new ArrayList<String>();
			num = -1;
			return null;
		}
		int a = Integer.valueOf(list.get(num));
		System.out.println("numa" + num);
		if (num <= list.size()) {
			return regimapper.finbyregiid(a);
		} else {
			System.out.println("123");
			return null;
		}
	}
}
