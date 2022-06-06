package Parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Print1Row {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
        FileInputStream file=new FileInputStream("E:\\Excel\\DataSheet.xlsx");
		
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet2");
		
		short cellsize = sh.getRow(0).getLastCellNum();
		
		for(int i=0;i<=cellsize-1;i++)
		{
			String data = sh.getRow(0).getCell(i).getStringCellValue();
			
			System.out.println(data);
		}
		
	}

}
