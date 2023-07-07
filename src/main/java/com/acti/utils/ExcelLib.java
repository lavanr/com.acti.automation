package com.acti.utils;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.File;
import java.io.FileInputStream;



public class ExcelLib {
     XSSFWorkbook wb;

     public  ExcelLib(String excelPath) {
    	 try
    	 {File file = new File(excelPath);
    	 XSSFWorkbook fis = new FileInputStream(file);
    	 wb = new XSSFWorkbook(fis);
    	 
    	 }
     catch(Exception e)
    	 {
    	 System.out.println("unable to load the excel file please check");
    	 e.printStackTrace();
    	 
    	 }
     }
     
    public int getRowCount(String sheetName)
    {
    	int count =wb.getSheet(sheetName).getLastRowNum()-1;
    	return count;
    }
    public int getRowCount(int sheetNum) {
    return wb.getSheet(sheetNum).getLastRowNum()+1;
    }
    
    public String getCellData(String sheetName,int row,int col) 
    { String data = wb.getSheet(SheetName).getRow(row).getCell(col).tostring();
    return data;
    }
    public String getCellData(int sheetNum,int row,int col) 
    { String data = wb.getSheet(SheetNum).getRow(row).getCell(col).tostring();
    return data;
    }
    
}




