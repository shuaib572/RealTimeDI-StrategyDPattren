package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import xom.nt.bo.CustomerBO;

public class CustomerDAOImp implements ICustomerDAO {
	private DataSource ds;
	private static final String INSERT_QUERY="INSERT INTO REALTIMEDI VALUES(CUSID_SEQ.NEXTVAL,?,?,?,?,?,?)";
	
	
	public CustomerDAOImp(DataSource ds)
	{
		System.out.println("********CustomerDTOImp Constructor call*****");
		this.ds=ds;
	}

	@Override
	public int insert(CustomerBO bo) throws Exception {
	
		Connection con=null;
		PreparedStatement ps=null;
		int count=0;
		
		try {
			con=ds.getConnection();
			ps=con.prepareStatement(INSERT_QUERY);
			ps.setString(1,bo.getCusName());
			ps.setString(2,bo.getCusAddres());
			ps.setFloat(3,bo.getPamt());
			ps.setFloat(4,bo.getTime());
			ps.setFloat(5,bo.getRate());
			ps.setFloat(6, bo.getInserstAmt());
			count=ps.executeUpdate();
			
		}catch(Exception se)
		{
			se.printStackTrace();
			throw se;
		}
		
		finally
		{
			try {
			if(ps!=null && con!=null)
			{
				ps.close();
				con.close();
			}
				
			}catch (Exception e) {
				e.printStackTrace();
				throw e;
			}
		}
		return count;
	}

}
