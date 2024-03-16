package ApachePOI;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadingExcel {


	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {

		File f = new File("C:\\FileWriting\\myExcelFile2.xlsx");
		FileInputStream fi =new FileInputStream(f);
		
		Workbook workbook = WorkbookFactory.create(fi);
		Sheet sheet0 = workbook.getSheetAt(0);
		
		for(Row row : sheet0)
		{
			for(Cell cell : row)
			{
				switch(cell.getCellType())
				{
				case Cell.CELL_TYPE_STRING:
					System.out.print(cell.getStringCellValue()+"\t");
					break;
				case Cell.CELL_TYPE_NUMERIC:
					System.out.print(cell.getNumericCellValue()+"\t");
					break;
				case Cell.CELL_TYPE_BLANK:
					System.out.print("Blank Cell"+"\t");
					break;
				}
			}
			System.out.println();
		}
		

		

		Sheet sheet1 = workbook.getSheetAt(1);
		
		for(Row row : sheet1)
		{
			for(Cell cell : row)
			{
				switch(cell.getCellType())
				{
				case Cell.CELL_TYPE_STRING:
					System.out.print(cell.getStringCellValue()+"\t");
					break;
				case Cell.CELL_TYPE_NUMERIC:
					System.out.print((int)(cell.getNumericCellValue())+"\t");
					break;
				case Cell.CELL_TYPE_BLANK:
					System.out.print("Blank Cell"+"\t");
					break;
				}
			}
			System.out.println();
		}
		
		
		
		/*Row row = sheet0.getRow(0);
		Cell cell = row.getCell(0);
		
		System.out.println(cell);*/
		
		fi.close();
	}

}
