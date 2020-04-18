package genericMethods;

import java.io.File;
import java.io.FileInputStream;


import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;




public class GetDataFromExcel 
{
	
	@SuppressWarnings("resource")
	public static String fromExcel(String fileName, String sName, int rIndex, int cIndex) {
			String data = null;
			try {
				//int i = 0;
				//File f = new File("ExcelSheets\\genericexcelsheet.xlsx");
				File f = new File("RestAssuredProject\\ExcelSheets\\testData.xlsx");
				FileInputStream fis = new FileInputStream(f);
				//Workbook wb = WorkbookFactory.create(fis);
				Workbook wb = new XSSFWorkbook(fis);
			    //XSSFSheet sheet = wb.getSheetAt(wb.getNumberOfSheets() - 1);
				Sheet st = wb.getSheet(sName);
				Row r = st.getRow(rIndex);
				Cell c = r.getCell(cIndex);
				data = c.toString();

			} catch (Exception e) {
              e.printStackTrace();
			}
			return data.substring(data.lastIndexOf("=") + 1);
			//return data;													
		}
	

	
		public static int keywordIndex(String keyword) {
			int i = 0;
			try {
				
				while (GetDataFromExcel.fromExcel("testData", "getSheet", i, 0).equals(keyword) == false) {
					
					i++;
				}
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("Keyword : "+keyword+" is Not Present ");
			}
			return i;

		}

	}


