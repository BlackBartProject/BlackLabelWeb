package com.Sanmina.BlackLabelWeb.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Sanmina.BlackLabelWeb.repository.ShipLoose_LoadRepository;
import com.Sanmina.BlackLabelWeb.ORM.ShipLoose_Load;;

@Service
public class ShipLoose_LoadService {

	@Autowired
	ShipLoose_LoadRepository repository;
	
	
	public List<ShipLoose_Load> getAllPOS() {
		List<ShipLoose_Load> posList = repository.findAll();
		return posList;
	}
	
		
	
	
	public List<ShipLoose_Load> findByCustomerPO(String customerPO) {
		try {
						
			return repository.findByCustomerPO(customerPO);
		}

		catch (Exception ex) {
			ex.printStackTrace();
			return repository.findByCustomerPO(customerPO);
		}
	}
	
	
	
	
	
	
	
}
