package com.bgdt.app.dao;

import java.util.ArrayList;

import com.bgdt.app.model.Customer;

public class CustomerDeleteData {

	public  ArrayList<Customer> deleteData(ArrayList<Customer> custList, int index) {
		custList.remove(index);
		return custList;
		
	}
}
