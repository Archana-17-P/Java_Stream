package ApachePOI;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingExcel {

	public static void main(String[] args) throws IOException {

		
		XSSFWorkbook workbook= new XSSFWorkbook();
		XSSFSheet sheet0 =  workbook.createSheet("First Sheet"); /** created First Sheet*/
	    
		Row row = sheet0.createRow(0);
		Cell cellA = row.createCell(0);
		Cell cellB = row.createCell(1);
		Cell cellC = row.createCell(2);
		cellA.setCellValue(" APURVA ");               /** Writing in First Sheet*/
		cellB.setCellValue(" ARJUN ");
		cellC.setCellValue(" PATIL ");
				
		XSSFWorkbook workbook1= new XSSFWorkbook();
		XSSFSheet sheet1 =  workbook.createSheet("Second Sheet"); /** created Second Sheet in same file*/
	    
		/** Writing in second sheet Multiples FROM 2 TO 10*/
	
		Row row1 = sheet1.createRow(0);
		Cell cella = row1.createCell(4);
		Cell cellb = row1.createCell(5);
		
		cella.setCellValue("Multiples");
		cellb.setCellValue("from 2 - 10 ");
		
		int num=2;
		for(int rows=1; rows<10; rows++)
		{
			Row r = sheet1.createRow(rows);
			int times=1;
			for(int cols=0; cols<10; cols++){
				
				Cell c = r.createCell(cols);
				c.setCellValue(times*num);
				times++;		
			}
			num++;			
		}
		
		File f = new File("C:\\FileWriting\\myExcelFile2.xlsx");
		FileOutputStream fo = new FileOutputStream(f);
		
		workbook.write(fo);
		
		//Closing the stream
		fo.close();
		
		System.out.println("File Created successfully");		

	}

}
