package com.bgdt.app;


import java.util.ArrayList;
import java.util.Scanner;

import com.bgdt.app.dao.CustomerDeleteData;
import com.bgdt.app.dao.CustomerInputData;
import com.bgdt.app.dao.CustomerPrintData;
import com.bgdt.app.dao.CustomerUpdateData;
import com.bgdt.app.model.Customer;

public class CustomerManageSys {
	//고객 정보를 저장할자료구조선언
	static ArrayList<Customer> custList = new ArrayList<>();
	 
	//기본입력장치로부터데이터를 입력받기위해Scanner객체생성
	static Scanner sc =new Scanner(System.in);
			
	public static void main(String[] args) {
		
		//리스트 정보를 조회하기 위해 인덱스를 필요로 함
		int index = -1;
		int count = 0; //custList.size()로대체가능
		
		CustomerInputData custInput=new CustomerInputData();
		CustomerPrintData custPrint=new CustomerPrintData();
		CustomerDeleteData custDelete=new CustomerDeleteData();
		CustomerUpdateData custUpdate=new CustomerUpdateData();
		// TODO Auto-generated method stub						
			while(true) {
				count=custList.size();
				//System.out.println("[INFO] 고객수:" + count + ", 인덱스: "+ index);
				System.out.printf("\n[INFO] 고객수: %d, 인덱스: %d\n", count, index);
				System.out.println("메뉴 입력");
				System.out.println("(I)nsert, (P)revious, (C)urrent, (N)ext, (U)pdate, (D)elete, (Q)uit");
				System.out.print("입력 :");
				String menu =sc.next();
				menu =menu.toLowerCase();
			
				switch(menu.charAt(0)) {
				case 'i':
					System.out.println("고객정보 입력을 시작합니다.");
					custList.add(custInput.insertData(sc));
				
					//insertData();
					System.out.println("입력이 완료 되었습니다.");
					break;
					
				case 'p':
					System.out.println("이전 데이터를 출력합니다.");
					if(index <= 0) {
						System.out.println("이전 데이터가 없습니다.");					
					}else {					
						index--;
						custPrint.printData(custList.get(index));
						//printCustInfr(index);
					}
					break;
				case 'c':
					System.out.println("현재 데이터를 출력합니다.");
					if((index >= 0) && (index < count)) {
						custPrint.printData(custList.get(index));
						//printCustInfr(index);			
					}else {															
						System.out.println("출력할 데이터가 선택되지 않았습니다.");
					}
					break;
					
				case 'n':
					System.out.println("다음 데이터를 출력합니다.");
					if(index >= count-1) {
						System.out.println("다음 데이터가 없습니다.");
					}else {
						index++;
						custPrint.printData(custList.get(index));
						//printCustInfr(index);
					}
					break;
				case 'u':
					System.out.println("데이터를 수정합니다.");
					if((index >= 0) && (index < count)) {
						System.out.println(index+"번째 데이터를 수정합니다.");
						custList.add(index, custUpdate.updateData(custList.get(index), sc));
						//updateCustInfr(index);			
					}else {															
						System.out.println("수정할 데이터가 선택되지 않았습니다.");
					}
					break;
				case 'd':				
					System.out.println("데이터를 삭제합니다.");
					if((index >= 0) && (index < count)) {
						System.out.println(index+"번째 데이터를 삭제합니다.");
						custList = custDelete.deleteData(custList, index);
						//deleteCustInfr(index);			
					}else {															
						System.out.println("삭제할 데이터가 선택되지 않았습니다.");
					}
					break;
				
				case 'q':
					System.out.println("프로그램을 종료합니다.");
					sc.close();
					System.exit(0);
					break;
				default :
					System.out.println("메뉴를  잘못 입력했습니다.");
				}
			}		
	}//main
	/*
	 * private static void deleteCustInfr(int index) {
	 * 
	 * // TODO Auto-generated method stub custList.remove(index); }
	 * 
	 * private static void updateCustInfr(int index) { // TODO Auto-generated method
	 * stub Customer cust =custList.get(index);
	 * System.out.println("---------UPDATE CUSTOMER INFO----------");
	 * System.out.print("이름(" + cust.getName() + ") :"); cust.setName(sc.next());
	 * 
	 * System.out.print("성별(" + cust.getGender() + ") :");
	 * cust.setGender(sc.next());
	 * 
	 * System.out.print("이메일(" + cust.getEmail() + ") :"); cust.setEmail(sc.next());
	 * 
	 * System.out.print("출생년도(" + cust.getBirthyear() + ") :");
	 * cust.setBirthyear(sc.nextInt());
	 * System.out.println("--------------------------------------"); }
	 * 
	 * public static void printCustInfr(int index) { // TODO Auto-generated method
	 * stub Customer cust =custList.get(index);
	 * System.out.println("******* 고객 정보 *******");
	 * System.out.println("이  름     : "+ cust.getName());
	 * System.out.println("성  별     : "+ cust.getGender());
	 * System.out.println("이메일    : "+ cust.getEmail());
	 * System.out.println("출생년도 : "+ cust.getBirthyear());
	 * System.out.println("***********************");
	 * 
	 * }
	 * 
	 * public static void insertData() { // TODO Auto-generated method stub
	 * System.out.print("이름 : "); String name =sc.next();
	 * System.out.print("성별(M/F): "); String gender =sc.next();
	 * System.out.print("이메일 : "); String email =sc.next();
	 * System.out.print("출생년도 : "); int birthyear =sc.nextInt();
	 * 
	 * Customer cust = new Customer(name, gender, email, birthyear);
	 * custList.add(cust); }
	 */

	
}// class