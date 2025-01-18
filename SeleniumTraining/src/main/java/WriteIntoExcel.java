import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteIntoExcel {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		XSSFWorkbook workbook = new XSSFWorkbook();
		
		XSSFSheet worksheet = workbook.createSheet("samplesheet");
		
		Map<String, Object[]> dataset = new TreeMap<String, Object[]>();
		
		dataset.put("1", new Object[] { "Id", "Name", "Company" });
		dataset.put("2", new Object[] { "1", "Parth", "Accenture" });
		dataset.put("3", new Object[] { "2", "Nithya", "Zoho" });
		dataset.put("4", new Object[] { "3", "Divyanshi", "Delhi" });
		dataset.put("5", new Object[] { "4", "Hetal", "Ghatkopar" });
		
		Set<String> set = dataset.keySet();
		int rownum = 0;
		
		for (String key : set) {
			Row row = worksheet.createRow(rownum++);
			
			Object[] data = dataset.get(key);
			int cellnum = 0;
			
			for (Object value : data) {
				
				Cell cell = row.createCell(cellnum++);
				
				if(value instanceof String) {
					cell.setCellValue((String) value);
				}else if (value instanceof Integer) {
					cell.setCellValue((Integer)value);
				}
				
			}
			
		}
		
		
		try {
			FileOutputStream fout = new FileOutputStream("samplesheetdemo.xlsx");
			workbook.write(fout);
			fout.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
	}

}
