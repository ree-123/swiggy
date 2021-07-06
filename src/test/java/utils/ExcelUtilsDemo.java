package utils;

public class ExcelUtilsDemo {
	
	public static void main(String[] args) {
		String projectPath = System.getProperty("user.dir");
		ExcelUtils excel = new ExcelUtils(projectPath+"/excel/data.xlsx", "Sheet1");
		excel.getRowCount();
		excel.getCellDataString(0, 0);
		excel.getCellDataNumber(1, 0);
		excel.getCellDataString(0, 1);
		excel.getCellDataString(1, 1);
		excel.getCellDataString(0, 2);
		excel.getCellDataString(1, 2);
		excel.getCellDataString(0, 3);
		excel.getCellDataString(1, 3);
	}

}
