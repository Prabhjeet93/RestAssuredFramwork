///*package demo.demo;
//
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.IOException;
//
//import org.apache.poi.hssf.usermodel.HSSFWorkbook;
//import org.apache.poi.ss.usermodel.Row;
//import org.apache.poi.ss.usermodel.Sheet;
//import org.apache.poi.ss.usermodel.Workbook;
////import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//
//public class Readexcel {
//	
//	public void readdata(int env, String sName, int r, int c) {
//		
//		try {
//			File f=new File("demoTest.xlsx");
//			
//			FileInputStream fi=new FileInputStream(f);
//			
//			
//			Workbook wb = new HSSFWorkbook(fi);
//			
//			
//			Sheet sh = wb.getSheet("name");
//			
//			Row r1=sh.getRow(env);
//			
//			for(int i=1;i<r1.getLastCellNum();i++) {
//			String c1=r1.getCell(i).getStringCellValue();
//			System.out.println(c1);
//			}
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//}
//	
//	
//	
//	
//
//	public static void main(String[] args) {
//		readdata
//
//	}
//
//}
