package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.IPaymentHistoryDAO;
import entities.PaymentHistory;
@Service
public class PaymentHistoryService implements IPaymentHistory {
	@Autowired
	IPaymentHistoryDAO dao;

	@Override
	public int createPaymentHistory(PaymentHistory paymenthistory) {
		// TODO Auto-generated method stub
		return dao.createPaymentHistory(paymenthistory);
	}

	@Override
	public int updatePaymentHistory(PaymentHistory paymenthistory) {
		// TODO Auto-generated method stub
		return dao.updatePaymentHistory(paymenthistory);
	}

	@Override
	public int deletePaymentHistory(int Payment_Id) {
		// TODO Auto-generated method stub
		return dao.deletePaymentHistory(Payment_Id);
	}

	@Override
	public PaymentHistory getPaymentHistoryById(int Payment_Id) {
		// TODO Auto-generated method stub
		return dao.getPaymentHistoryById(Payment_Id);
	}

	@Override
	public List<PaymentHistory> getAllPaymentHistory() {
		// TODO Auto-generated method stub
		return dao.getAllPaymentHistory();
	}

}
