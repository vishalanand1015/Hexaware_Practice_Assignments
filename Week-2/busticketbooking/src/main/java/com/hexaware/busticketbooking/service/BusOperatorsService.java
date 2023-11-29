package com.hexaware.busticketbooking.service;

import java.util.ArrayList;

import java.util.List;


import org.springframework.stereotype.Service;

import com.hexaware.busticketbooking.entity.BusOperators;

@Service
public class BusOperatorsService implements IBusOperators {
	

	@Override
	public int createBusOperators(BusOperators busoperators) {
		// TODO Auto-generated method stub
		return 1;
	}


	public int updateBusOperators(BusOperators busoperators) {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public int deleteBusOperators(int Operator_ID) {
		// TODO Auto-generated method stub
		return 101;
	}

	@Override
	public BusOperators getBusOperatorsById(int Operator_ID) {
		BusOperators b=new BusOperators(101,"Hacker",45654,5,1);
		
		return b;
	}
	@Override
	public List<BusOperators> getAllBusOperators() {
		
		List<BusOperators>  getallbusop=new ArrayList<>();
		
		getallbusop.add(new BusOperators(101,"Hacker",45654,5,1));
		getallbusop.add(new BusOperators(102,"king",45678,1,2));
		
		return getallbusop;
		
	
	}

}
