package Parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class getRowSize {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream file=new FileInputStream("E:\\Excel\\DataSheet.xlsx");
		
		int Rowsize = WorkbookFactory.create(file).getSheet("Sheet1").getLastRowNum();
		
		System.out.println(Rowsize); //0
		System.out.println(Rowsize+1);// actual row size
		
	}

}
