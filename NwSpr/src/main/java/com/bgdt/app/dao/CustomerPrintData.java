package com.bgdt.app.dao;

import com.bgdt.app.model.Customer;

public class CustomerPrintData {
	
	
	public  Customer printData(Customer cust) {
			
	System.out.println("******* 고객 정보 *******");
	System.out.println("이  름     : "+ cust.getName());
	System.out.println("성  별     : "+ cust.getGender());
	System.out.println("이메일    : "+ cust.getEmail());
	System.out.println("출생년도 : "+ cust.getBirthyear());		
	System.out.println("***********************");
	
	return cust;
	}
}
