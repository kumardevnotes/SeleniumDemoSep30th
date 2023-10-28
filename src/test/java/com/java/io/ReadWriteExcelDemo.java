package com.java.io;

import java.io.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadWriteExcelDemo {

	public static void main(String[] args) throws IOException {
		/*
		 *  Reading from excel workbook
		 * 
		 * 1. Copy excel dependencies (apache poi dependencies ) and add in your
		 *       project's POM.xml and then save it 
		 *       
		 * 2. Write your code using XSSS=FWorkbook
		 *      and XSSFWorksheet class level methods to read/write data into excel
		 */

		// Below statement gives you root folder path
		String rootPath = System.getProperty("user.dir");

		// Reading from excel workbook
		FileInputStream fileInputStream = new FileInputStream(
				new File(rootPath + "//src//test//resources//MyTestData.xlsx"));

		// Create Workbook instance holding reference to .xlsx file
		XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);

		// Get first/desired sheet from the workbook
		XSSFSheet sheet = workbook.getSheet("AppData");
		System.out.println(sheet.getRow(2).getCell(1).toString());
		

		// Writing into excel workbook
		
		System.out.println("Before writing/updating into excel sheet");
		System.out.println(sheet.getRow(2).getCell(1).toString()); // https://gmail_abc.com

		// To write into Excel sheet
		FileOutputStream fileOutputStream = new FileOutputStream(
				new File(rootPath + "//src//test//resources//MyTestData.xlsx"));

		// To update or write changes into excel sheet
		sheet.getRow(2).getCell(1).setCellValue("https://gmail_xyz.com");

		// Write changes into excel sheet
		workbook.write(fileOutputStream);

		System.out.println("After writing/updating into excel sheet");
		System.out.println(sheet.getRow(2).getCell(1).toString()); // https://gmail_xyz.com

		// Save and  close excel sheet
		fileOutputStream.close();

	}

}
