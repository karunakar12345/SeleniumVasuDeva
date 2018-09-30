package com.vasu.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDrivenTesting
{

	public static void main(String[] args) throws Exception
	{
		
		OrangeHRM app=new OrangeHRM();
		app.appLaunch("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");
		app.appLogin("Admin", "Admin");
File srcFile=new File("C:\\Users\\somesh\\Desktop\\TestData.xlsx");
		
		FileInputStream fis=new FileInputStream(srcFile);
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		
		XSSFSheet ws=wb.getSheet("Sheet1");
		//row count
		int rcnt=ws.getLastRowNum();
		for(int i=1;i<=rcnt;i++)
		{
			String fName=ws.getRow(i).getCell(0).getStringCellValue();
			String lName=ws.getRow(i).getCell(1).getStringCellValue();
			
			String Results=app.empReg(fName, lName);
			ws.getRow(i).createCell(3).setCellValue(Results);
			
			FileOutputStream fos=new FileOutputStream(srcFile);
			wb.write(fos);
			
		}
		wb.close();
	}

}
