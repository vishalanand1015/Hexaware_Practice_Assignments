package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.IBusOperatorsDAO;
import entities.BusOperators;
@Service
public class BusOperatorsService implements IBusOperators {
	@Autowired
	IBusOperatorsDAO dao;

	@Override
	public int createBusOperators(BusOperators busoperators) {
		// TODO Auto-generated method stub
		return dao.createBusOperators(busoperators);
	}

	@Override
	public int updateBusOperators(BusOperators busoperators) {
		// TODO Auto-generated method stub
		return dao.updateBusOperators(busoperators);
	}

	@Override
	public int deleteBusOperators(int Operator_ID) {
		// TODO Auto-generated method stub
		return dao.deleteBusOperators(Operator_ID);
	}

	@Override
	public BusOperators getBusOperatorsById(int Operator_ID) {
		// TODO Auto-generated method stub
		return dao.getBusOperatorsById(Operator_ID);
	}

	@Override
	public List<BusOperators> getAllBusOperators() {
		// TODO Auto-generated method stub
		return dao.getAllBusOperators();
	}

}
