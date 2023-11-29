package dao;

public class Employee {
	private int bid;
	private String cname;
	private double dcode;
	public Employee() {
		
	}
	public Employee(int bid, String cname, double dcode) {
		super();
		this.bid = bid;
		this.cname = cname;
		this.dcode = dcode;
	}
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public double getDcode() {
		return dcode;
	}
	public void setDcode(double dcode) {
		this.dcode = dcode;
	}
	@Override
	public String toString() {
		return "Employee [bid=" + bid + ", cname=" + cname + ", dcode=" + dcode + "]";
	}
	
	
	
}
	
	
	
	
	