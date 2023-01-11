package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ToWriteDataIntoExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./testData/dataExcel.xlsx");
		Workbook workbook = WorkbookFactory.create(fis);
		workbook.getSheet("sheet1").getRow(0).createCell(3).setCellValue("NAME");
		FileOutputStream fos = new FileOutputStream("./testData/dataExcel.xlsx");
		workbook.write(fos);
		

	}

}
