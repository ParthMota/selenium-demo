import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteIntoExcel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		XSSFWorkbook workbook = new XSSFWorkbook();
		
		XSSFSheet worksheet = workbook.createSheet("samplesheet");
		
		Map<String, Object[]> dataset = new TreeMap<String, Object[]>();
		
	}

}
