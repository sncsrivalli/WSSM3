package datadriventesting;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteDataIntoExcelNewRow {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// Step 1: Convert physical file into java readable object
		// It throws FileNotFoundException
		FileInputStream fis = new FileInputStream("./testdata/TD1.xlsx");

		// import Workbook, WorkbookFactory, Sheet, Row, Cell from
		// org.apache.poi.ss.usermodel
		Workbook wb = null;
		try {
			// Step 2: Open excel workbook
			// It throws EncryptedDocumentException, IOException
			wb = WorkbookFactory.create(fis);

			// Step 3: Fetch required sheet
			Sheet sheet = wb.getSheet("Sheet1");

			// Step 4: Create required new row to edit
			Row row = sheet.createRow(3);

			// Step 5: create required cell to edit
			Cell cell = row.createCell(0);

			// Step 6: Set data into cell
			cell.setCellValue("####");

			// Step 7: Save data into excel
			FileOutputStream fos = new FileOutputStream("./testdata/TD1.xlsx");
			wb.write(fos);
		}

		finally {
			// Step 8: close workbook
			wb.close();
		}

	}

}
