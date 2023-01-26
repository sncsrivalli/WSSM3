package datadriventesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataFromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		//Step 1: Convert physical file into java readable object
		// It throws FileNotFoundException
		FileInputStream fis = new FileInputStream("./testdata/TD1.xlsx");
		
		//import Workbook, WorkbookFactory, Sheet, Row, Cell from org.apache.poi.ss.usermodel
		
		Workbook wb = null;
		try {
		//Step 2: Open excel workbook
		//It throws EncryptedDocumentException, IOException
		wb = WorkbookFactory.create(fis);
		
//		//Step 3: Fetch required sheet
//		Sheet sheet = wb.getSheet("Sheet1");
//		
//		//Step 4: Fetch required row
//		Row row = sheet.getRow(0);
//		
//		//Step 5: Fetch required cell
//		Cell cell = row.getCell(1);
//		
//		//Step 6: Read data from cell
//		String data = cell.getStringCellValue();
		String data = wb.getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();
		System.out.println(data);
		}
		
		finally {
		//Step 7: Close workbook
		wb.close();
		}
		
	}

}
