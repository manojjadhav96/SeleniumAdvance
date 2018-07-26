package pom.accenture.utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import pom.accenture.pages.Registration;

public class ExcelUtilities {
	public void getTestdata() throws IOException
	{
		FileInputStream Fin = new FileInputStream("C:\\Manoj\\TestData.xls");
		HSSFWorkbook x = new HSSFWorkbook(Fin);
		HSSFSheet s = x.getSheet("Sheet1");
		int rowcount = s.getLastRowNum();
		for(int i=1;i<=rowcount;i++)
		{
			String FirstName =s.getRow(i).getCell(0).getStringCellValue();
			String LastName =s.getRow(i).getCell(1).getStringCellValue();
			String Email =s.getRow(i).getCell(2).getStringCellValue();
			String Password =s.getRow(i).getCell(3).getStringCellValue();
			String ConfirmPassword =s.getRow(i).getCell(4).getStringCellValue();
			System.out.println(FirstName+" "+LastName+" "+Email+" "+Password+" "+ConfirmPassword);
			Registration.enterregistration(FirstName, LastName, Email, Password, ConfirmPassword);
		}
		//String data =s.getRow(1).getCell(0).getStringCellValue();
		//System.out.println(data);
	}
	public static void main(String args[]) throws IOException
	{
		ExcelUtilities e = new ExcelUtilities();
		e.getTestdata();
	}

}
