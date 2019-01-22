package com.exceltodatabase.model;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ContractDataMapper {
	
	@SuppressWarnings("resource")
	public List<Contract> contractDataMapping(String rebateFile) throws IOException {
		XSSFWorkbook workbook = new XSSFWorkbook(rebateFile);
		XSSFSheet sheet = workbook.getSheetAt(0);
		List<String> customerAccounts = new CopyOnWriteArrayList<>();
		List<Contract> contracts=new CopyOnWriteArrayList<>();
		for (int i = 1; i <= sheet.getLastRowNum(); i++) {
			XSSFRow row = sheet.getRow(i);
			XSSFCell cell0 = row.getCell(0);
			String customerAccount = cell0.toString();
			XSSFCell cell1 = row.getCell(1);
			String productName = cell1.toString();
			XSSFCell cell2 = row.getCell(2);
			String listPrice = cell2.toString();
			XSSFCell cell3 = row.getCell(3);
			String entryStartDate = cell3.toString();
			XSSFCell cell4 = row.getCell(4);
			String entryEndDate = cell4.toString();
			XSSFCell cell5 = row.getCell(5);
			String source = cell5.toString();
			XSSFCell cell6 = row.getCell(6);
			String quoteNumber = cell6.toString();
			XSSFCell cell7 = row.getCell(7);
			String quantity = cell7.toString();
			XSSFCell cell8 = row.getCell(8);
			String updatedBy = cell8.toString();
			
			contracts.add(new Contract(customerAccount, productName, listPrice, entryStartDate, entryEndDate, source, quoteNumber, quantity, updatedBy));
			customerAccounts.add(customerAccount);
		}
		System.out.println(contracts.size());
		return contracts;
	}

	
}
