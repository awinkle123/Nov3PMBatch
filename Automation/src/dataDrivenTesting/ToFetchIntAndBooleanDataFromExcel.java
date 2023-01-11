package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ToFetchIntAndBooleanDataFromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		 FileInputStream fis = new FileInputStream("./testData/dataExcel.xlsx");
			Workbook workbook = WorkbookFactory.create(fis);
			double intvalue = workbook.getSheet("sheet2").getRow(0).getCell(0).getNumericCellValue();
			System.out.println(intvalue);
			boolean booleanValue = workbook.getSheet("sheet2").getRow(0).getCell(1).getBooleanCellValue();
            System.out.println(booleanValue);
	}

}
