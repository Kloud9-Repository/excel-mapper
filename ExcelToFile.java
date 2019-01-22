package com.exceltodatabase.model;

import java.io.PrintWriter;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ExcelToFile {
	public static void main(String[] args) {
		String rebateFile = "C:/Users/hsantosh/Desktop/Model N/Contract Test.xlsx";
		ContractDataMapper contractDataMapper = new ContractDataMapper();
		try {
			PrintWriter writer=new PrintWriter("C:/Users/hsantosh/Desktop/Model N/Contract_data.txt");
			List<Contract> contracts = contractDataMapper.contractDataMapping(rebateFile);
			Map<String, Integer> counterMap = findcustomerAccountOccurance(contracts);
			System.out.println(counterMap);
			for (String key : counterMap.keySet()) {
				Integer occurance = counterMap.get(key);
				for(Contract contract:contracts){
					if(contract.getCustomerAccount().equalsIgnoreCase(key)){
				//		System.out.println(contract);
						writer.print(contract);
						System.out.println(key);
					}else{
						continue;
					}
				}
				
			}
			writer.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// static Map<String,Integer> counterMap=null;
	private static Map<String, Integer> findcustomerAccountOccurance(List<Contract> contracts) {
		Map<String, Integer> countMap = new ConcurrentHashMap<>();
		for (Contract contract : contracts) {
			String customerAccount = contract.getCustomerAccount();
			if (countMap.containsKey(customerAccount)) {
				countMap.put(customerAccount, countMap.get(customerAccount) + 1);
			} else {
				countMap.put(customerAccount, 1);
			}
		}
		return countMap;
	}
}
