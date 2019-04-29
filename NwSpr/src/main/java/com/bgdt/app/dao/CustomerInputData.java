package com.bgdt.app.dao;


import java.util.Scanner;

import com.bgdt.app.model.Customer;

public class CustomerInputData {
	//ArrayList<Customer> custList = new ArrayList<>();
	
	//Scanner sc = new Scanner(System.in);
	//System.out.println("고객정보 입력을 시작합니다.");
	public  Customer insertData(Scanner sc) {
		// TODO Auto-generated method stub
		System.out.print("이름 : ");
		String name =sc.next();
		System.out.print("성별(M/F): ");
		String gender =sc.next();
		System.out.print("이메일 : ");
		String email =sc.next();
		System.out.print("출생년도 : ");
		int birthyear =sc.nextInt();
		
		Customer cust = new Customer(name, gender, email, birthyear);
//		custList.add(cust);
		return cust;
	}
	//System.out.println("입력이 완료 되었습니다.");

}
