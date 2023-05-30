package com.nt.vo;

public class CustomerVO {
	private String cusName;
	private String cusAddres;
	private String pamt;
	private String rate;
	private String time;
	public String getCusName() {
		return cusName;
	}
	public void setCusName(String cusName) {
		this.cusName = cusName;
	}
	public String getCusAddres() {
		return cusAddres;
	}
	public void setCusAddres(String cusAddres) {
		this.cusAddres = cusAddres;
	}
	public String getPamt() {
		return pamt;
	}
	public void setPamt(String pamt) {
		this.pamt = pamt;
	}
	public String getRate() {
		return rate;
	}
	public void setRate(String rate) {
		this.rate = rate;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	@Override
	public String toString() {
		return "CustomerVO [cusName=" + cusName + ", cusAddres=" + cusAddres + ", pamt=" + pamt + ", rate=" + rate
				+ ", time=" + time + "]";
	}
	
}
