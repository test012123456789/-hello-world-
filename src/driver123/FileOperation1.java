package driver123;

import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hslf.model.Sheet;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFTable;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;

import org.apache.poi.xssf.util.*;
//import org.apache.poi.ss.usermodel.Workbook;

public class FileOperation1 {
  @Test
  public String f() throws IOException {
	  int i=0, j=0;
		String Filepath = ("E:\\Excel_1\\ExcelProgram\\File29.xlsx");
	File f1 = new File(Filepath);
	FileInputStream fin = new FileInputStream(f1);
	XSSFWorkbook w1 = new XSSFWorkbook(fin);
	XSSFSheet sheet = (XSSFSheet) w1.getSheet("Sheet1");
	int Rowcount = sheet.getLastRowNum();
  System.out.println(Rowcount);
	
//	int Colcount = sheet.getLastCellNum();

//	System.out.println(Rowcount);
	//System.out.println(Colcount);
	for(i=0;i<=Rowcount;i++)
	{
		XSSFRow Rowloop = sheet.getRow(i);
		System.out.println(i);
		int k=0, l=0;
		k=Rowloop.getFirstCellNum();
		l=Rowloop.getLastCellNum();
		while(k<l)
		{
		System.out.println(Rowloop.getCell(k));
		String value = null;
		k++;
		};
	}
//	fin.close();
//	w1.close();
	return Filepath;
	
	}
}

