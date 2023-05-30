package com.nt.serivce;

import com.nt.dao.ICustomerDAO;
import com.nt.dto.CustomerDTO;

import xom.nt.bo.CustomerBO;

public class CustometMngServiceImp implements ICustomerMngService {

	
	private ICustomerDAO dao;
	
	
	public CustometMngServiceImp(ICustomerDAO dao) {
		System.out.println("ICustometMngServiceImp 1: param Counstructor");
		this.dao = dao;
	}


	@Override
	public String calculateInterset(CustomerDTO dto) throws Exception {
		
		//calculate interset 
		Float itr=(dto.getPamt()*dto.getRate()*dto.getTime())/100.0f;
		CustomerBO bo=new CustomerBO();
		bo.setCusName(dto.getCusName());
		bo.setCusAddres(dto.getCusAddres());
		bo.setPamt(dto.getPamt());
		bo.setRate(dto.getRate());
		bo.setTime(dto.getTime());
		bo.setInserstAmt(itr);
		//use DAO  
		int count=dao.insert(bo);
		// terinay operator using if else?
		return count==1?"Customet Registed sucessfully::"+itr:"Customer registration falid";
	}

}
