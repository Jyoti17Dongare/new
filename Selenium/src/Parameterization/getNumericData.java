package Parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class getNumericData {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException{
		
		FileInputStream file=new FileInputStream("E:\\Excel\\DataSheet.xlsx");
		
		double data = WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(2).getNumericCellValue();
		
		System.out.println(data);
		
		int data1 = (int)data;
		
		System.out.println(data1);
	}

}
