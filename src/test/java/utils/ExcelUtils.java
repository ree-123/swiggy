package utils;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	
	static String projectPath;
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	
	public ExcelUtils(String excelPath, String sheeName) {
		try {
			
		
		   projectPath = System.getProperty("user.dir");
		   workbook = new XSSFWorkbook(excelPath);
		   sheet = workbook.getSheet(sheeName);}catch(Exception e) {
			   e.printStackTrace();
		   }
	}
	public static void main(String[] args) {
		//getRowCount();
	    getCellDataString(0,0);
	    getCellDataNumber(1,0);
	}
	
	public static void getRowCount() {
		try {
			
			 
		int rowCount= sheet.getPhysicalNumberOfRows();
		
		System.out.println("No of rows :"+rowCount);
		
		
		}catch(Exception exp) {
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
		exp.printStackTrace();
		}
		
				
	}
	
	public static void getCellDataString(int rowNum,int colNum ) {
		try {
		  
			String cellData = sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
			System.out.println(cellData);
		}catch(Exception exp) {
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
		exp.printStackTrace();
		}
	}
	
	public static void getCellDataNumber(int rowNum,int colNum ) {
		try {

			double cellData = sheet.getRow(rowNum).getCell(colNum).getNumericCellValue();
			System.out.println(cellData);
		}catch(Exception exp) {
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
		exp.printStackTrace();
		}
	}
}
