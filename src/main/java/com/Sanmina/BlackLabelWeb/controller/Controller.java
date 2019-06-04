package com.Sanmina.BlackLabelWeb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Sanmina.BlackLabelWeb.service.FtpSettingService;
import com.Sanmina.BlackLabelWeb.ORM.FtpSetting;
@RestController
public class Controller {
	
	
	@Autowired
	FtpSettingService ftpSettingService;
	
	
	@GetMapping("getAllFtpSetting")
	public List<FtpSetting>getAllFtpSetting(){
		List<FtpSetting>ftpSettingList=ftpSettingService.getAllFtpSetting();
		
		
		return ftpSettingList;
	}
	
	
	

}
