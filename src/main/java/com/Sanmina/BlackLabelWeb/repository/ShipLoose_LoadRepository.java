package com.Sanmina.BlackLabelWeb.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import  com.Sanmina.BlackLabelWeb.ORM.ShipLoose_Load;



@Repository
public interface ShipLoose_LoadRepository extends JpaRepository<ShipLoose_Load,Integer> {

	List<ShipLoose_Load> findByCustomerPO(String customerPO);
	List<ShipLoose_Load> findAll();
}
