package com.nt.dto;

import java.io.Serializable;

public class CustomerDTO implements Serializable {
	private String cusName;
	private String cusAddres;
	private Float pamt;
	private Float rate;
	private Float time;
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
	public Float getPamt() {
		return pamt;
	}
	public void setPamt(Float pamt) {
		this.pamt = pamt;
	}
	public Float getRate() {
		return rate;
	}
	public void setRate(Float rate) {
		this.rate = rate;
	}
	public Float getTime() {
		return time;
	}
	public void setTime(Float time) {
		this.time = time;
	}
	@Override
	public String toString() {
		return "CustomerDTO [cusName=" + cusName + ", cusAddres=" + cusAddres + ", pamt=" + pamt + ", rate=" + rate
				+ ", time=" + time + "]";
	}
	
}
