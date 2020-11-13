package com.example.hospitalpro.doctor.service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hospitalpro.common.entity.Doctor;
import com.example.hospitalpro.common.entity.Regi;
import com.example.hospitalpro.user.mapper.RegiMapper;

@Service
public class DoctorServiceImpl implements DoctorService {
	@Autowired
	RegiMapper regimapper;

	@Override
	public String callback(int id) {
		SimpleDateFormat df = new SimpleDateFormat("yyyyMMdd");
		List<Regi> regi = regimapper.findallreg(id);
		String regitime = df.format(regi.get(0).getTime());
		String nowtime = df.format(new Date());
		if (regitime.equals(nowtime)) {
			return "当日预约不可取消";
		} else {
			regimapper.sign(id);
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
		List<Doctor> work = regimapper.findbywork(id);
		if (work.get(0).getWork().getFriam() == 1) {

		}

		return null;
	}
}
