package dao;

import java.util.List;

import entities.PaymentHistory;

public interface IPaymentHistoryDAO {
	public int createPaymentHistory(PaymentHistory paymenthistory);
	public int updatePaymentHistory(PaymentHistory  paymenthistory);
	public int  deletePaymentHistory(int Payment_Id);
	public PaymentHistory getPaymentHistoryById(int Payment_Id);
	public List<PaymentHistory>getAllPaymentHistory();

}
