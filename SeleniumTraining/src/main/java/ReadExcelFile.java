import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fin = new FileInputStream("samplesheetdemo.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook(fin);
		
		XSSFSheet sheet = workbook.getSheet("samplesheet");
		
		Row row;
		Cell cell;
		
		Iterator<Row> rowITR = sheet.iterator();
		
		while (rowITR.hasNext()) {
			row = (Row) rowITR.next();
			
			Iterator<Cell> cellITR = row.iterator();
			while (cellITR.hasNext()) {
				cell = (Cell) cellITR.next();
				DataFormatter formatter = new DataFormatter();
				String txt = formatter.formatCellValue(cell);
				
				System.out.println(txt);
			}
		}
		
	}

}
