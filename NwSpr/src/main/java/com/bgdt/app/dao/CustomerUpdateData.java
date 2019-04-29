package com.bgdt.app.dao;


import java.util.Scanner;

import com.bgdt.app.model.Customer;

public class CustomerUpdateData {
	
	public Customer updateData(Customer cust,  Scanner sc) {
	//Customer cust =custList.get(index);
	System.out.println("---------UPDATE CUSTOMER INFO----------");
	System.out.print("이름(" + cust.getName() + ") :");
	cust.setName(sc.next());
	
	System.out.print("성별(" + cust.getGender() + ") :");
	cust.setGender(sc.next());
	
	System.out.print("이메일(" + cust.getEmail() + ") :");
	cust.setEmail(sc.next());
	
	System.out.print("출생년도(" + cust.getBirthyear() + ") :");
	cust.setBirthyear(sc.nextInt());
	System.out.println("--------------------------------------");
	
	return cust;
	}
}
