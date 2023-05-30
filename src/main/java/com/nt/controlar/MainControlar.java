package com.nt.controlar;

import com.nt.dto.CustomerDTO;
import com.nt.serivce.ICustomerMngService;
import com.nt.vo.CustomerVO;

public class MainControlar {
	public  MainControlar()
	{
		
	}
	private ICustomerMngService service;

	public MainControlar(ICustomerMngService service) {
		System.out.println("MainControlar ::  Constructor");
		this.service = service;
	}
	public String processCustomer(CustomerVO  vo)throws Exception
	{
		CustomerDTO dto=new CustomerDTO();
		dto.setCusName(vo.getCusName());
		dto.setCusAddres(vo.getCusAddres());
		dto.setPamt(Float.parseFloat(vo.getPamt()));
		dto.setRate(Float.parseFloat(vo.getRate()));
		dto.setTime(Float.parseFloat(vo.getTime()));
		
		// use service
		String result=service.calculateInterset(dto);
		
		return result;
	}
}
