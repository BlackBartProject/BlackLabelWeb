package com.Sanmina.BlackLabelWeb.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.swing.text.DefaultEditorKit.CutAction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Sanmina.BlackLabelWeb.service.FtpSettingService;
import com.Sanmina.BlackLabelWeb.service.ShipLoose_LoadService;
import com.Sanmina.BlackLabelWeb.ORM.ShipLoose_Load;
import com.Sanmina.BlackLabelWeb.ORM.FtpSetting;
import com.Sanmina.BlackLabelWeb.ftp.FtpConnection;
import com.Sanmina.BlackLabelWeb.ftp.FtpFunctions;


@RestController
public class Controller {
	
	
	@Autowired
	FtpSettingService ftpSettingService;
	
	
	@Autowired
	ShipLoose_LoadService shiplooseLoadService;
	
	private FtpConnection ftpConnection;
	private FtpFunctions ftpOperations;
	
	
	/*
	 *TODO -mejorar algoritmo de extracción de PO's
	 */
	@GetMapping("findByCustomerPO") //Fetch PO list to show in front-end 
	public List<String> findByCustomerPO(@RequestParam String customerPO){			
		
		List<String> customerPoList=null;
	
		/*TODO
		 *Validar SPECS por medio de consulta a la tabla y quitar harcodeados 
		 */	
		try {
			customerPoList = new ArrayList();
			
			for (int i = 0; i < shiplooseLoadService.findByCustomerPO(customerPO).size(); i++) {

				if (shiplooseLoadService.findByCustomerPO(customerPO).get(i).getOrderedItem().contains("P0603015")
						|| shiplooseLoadService.findByCustomerPO(customerPO).get(i).getOrderedItem().contains("P0800765")
						|| shiplooseLoadService.findByCustomerPO(customerPO).get(i).getOrderedItem().contains("P0800766")
						|| shiplooseLoadService.findByCustomerPO(customerPO).get(i).getOrderedItem().contains("P0800762")
						|| shiplooseLoadService.findByCustomerPO(customerPO).get(i).getOrderedItem().contains("N0229552")) {
					customerPoList.add(shiplooseLoadService.findByCustomerPO(customerPO).get(i).getCustomerPO()
							.concat("-" + shiplooseLoadService.findByCustomerPO(customerPO).get(i).getCustomerPOLine()));
				}
			}

			return customerPoList;
		}	
		
		
		catch (Exception ex) {
			ex.printStackTrace();

			return customerPoList;
		}
		
		
		
		
		
		
		
		// return shiplooseLoadService.findByCustomerPO(customerPO);
	}
	
	
	
	
	/*
	 *TODO
	 *- Obtener SPEC shiploose-
	 *- Obtener cadena Shiploose-
	 *-desmenuzar cadena Shiploose y obtener SPEC limpia-
	 *-Guardar archivo en carpeta
	 */
	@GetMapping("download")
	public String downloadFtpFile(@RequestParam String customerPO){
		
		
	String stringifyPo,stringifyPoLine;
	String shiploose=null;
	String spec;
		
	/*==============
	 * Separar Po y PoLine
	 * Obtener campo Shiploose 
	 * Obtener spec limpia de Shiploose
	 ==============*/
	stringifyPo=customerPO.substring(0,customerPO.lastIndexOf("-"));
	stringifyPoLine=customerPO.substring(customerPO.lastIndexOf("-")+1,customerPO.length());
		
	
    for (int i = 0; i <shiplooseLoadService.findByCustomerPO(stringifyPo).size(); i++) {
		if(shiplooseLoadService.findByCustomerPO(stringifyPo).get(i).getCustomerPOLine().equals(stringifyPoLine)){
			shiploose=shiplooseLoadService.findByCustomerPO(stringifyPo).get(i).getShipLoose();	}
	}
	
    spec=shiploose.split(",")[0].substring(4); //=> Obtener spec limpia de Shiploose
    
	
    
    
    
    List<FtpSetting>ftpSettingList=ftpSettingService.getAllFtpSetting();
	
	ftpOperations=new FtpFunctions(ftpSettingList.get(0).getServer(),ftpSettingList.get(0).getUser(),
			ftpSettingList.get(0).getPassword(),ftpSettingList.get(0).getPath());
	
	
	
	ftpOperations.downloadSpecFile();
    
    
    
    
		return customerPO;
	}
	
	
	
	
	
	
	
//	@GetMapping("ftpConnection")
//	public boolean ftpConnection(){
//		
//	
//		
//		List<FtpSetting>ftpSettingList=ftpSettingService.getAllFtpSetting();
//		
//		ftpOperations=new FtpFunctions(ftpSettingList.get(0).getServer(),ftpSettingList.get(0).getUser(),
//				ftpSettingList.get(0).getPassword(),ftpSettingList.get(0).getPath());
//		
//		
//		
//		ftpOperations.getPathFtp();
//
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		return ftpOperations.connectionFtp();
//	}
	
	

}
