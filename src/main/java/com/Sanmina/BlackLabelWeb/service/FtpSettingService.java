package com.Sanmina.BlackLabelWeb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Sanmina.BlackLabelWeb.repository.FtpSettingRepository;
import com.Sanmina.BlackLabelWeb.ORM.FtpSetting;

@Service
public class FtpSettingService {

	@Autowired
	FtpSettingRepository repository;
	
	public List<FtpSetting>getAllFtpSetting(){
		return repository.findAll();
	}
	
	
	
}
