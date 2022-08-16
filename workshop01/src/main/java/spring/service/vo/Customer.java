package spring.service.vo;

public class Customer {
	private String ssn;
	private String custName;
	private String address;

	public Customer() {
		super();
	}

	public Customer(String ssn, String custName, String address) {
		super();
		this.ssn = ssn;
		this.custName = custName;
		this.address = address;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Customer [ssn=" + ssn + ", custName=" + custName + ", address=" + address + "]";
	}

}
