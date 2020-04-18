package genericMethods;

import static io.restassured.RestAssured.given;

import java.io.IOException;
import java.net.URI;
import java.util.HashMap;

import org.testng.annotations.Test;

import groovyjarjarantlr.ParserSharedInputState;
import io.restassured.response.Response;
import operations.readXMLAndJsonFile;


public class genericMethod {
	GetDataFromExcel excel = new GetDataFromExcel();
	readXMLAndJsonFile readxmlJson = new readXMLAndJsonFile();
	
	
	//Fetching URL
	public String URL()
	{
	int new2 = GetDataFromExcel.keywordIndex("URLValue");
	System.out.println("New2 : "+new2);
	String URL = (GetDataFromExcel.fromExcel("testData", "postSheet", GetDataFromExcel.keywordIndex("URLValue"), 2));
	
	System.out.println("URL :: "+URL);
	return URL;
	}
	//Fetching Parameters
	public HashMap<String,String> Parameters()
	{
		
	
	HashMap<String,String> parameter  = new HashMap<String,String>();
	int a=2;
	//String size = GetDataFromExcel.fromExcel("testData", "getSheet", GetDataFromExcel.keywordIndex("ParameterKey"), 1);
	String index =GetDataFromExcel.fromExcel("testData", "postSheet", GetDataFromExcel.keywordIndex("HeaderKey"), 1);
	int indexNum = Integer.parseInt(index);
	System.out.println("indexNum :: "+indexNum);
	for(int j=0;j<indexNum;j++)
	{
		
		parameter.put(GetDataFromExcel.fromExcel("testData", "getSheet", GetDataFromExcel.keywordIndex("ParameterKey"), a), GetDataFromExcel.fromExcel("testData", "getSheet", GetDataFromExcel.keywordIndex("ParameterValue"), a));
	a++;
	}
	
	System.out.println("parameter :: "+parameter);
	return parameter;
	}

	
	//Headers
	
	public HashMap<String,String> HeaderInfo(){
		
	
	HashMap<String,String> header  = new HashMap<String,String>();
	int k=2;
	String index =GetDataFromExcel.fromExcel("testData", "postSheet", GetDataFromExcel.keywordIndex("HeaderKey"), 1);
	int indexNum = Integer.parseInt(index);
	System.out.println("indexNum :: "+indexNum);
	
	for(int j=0;j<indexNum;j++)
	{
		header.put(GetDataFromExcel.fromExcel("testData", "postSheet", GetDataFromExcel.keywordIndex("HeaderKey"), k), GetDataFromExcel.fromExcel("testData", "postSheet", GetDataFromExcel.keywordIndex("HeaderValue"), k));
	     k++;
	}
	
	          System.out.println("HeaderData :: "+header);
	return header;
	}
	
	//@Test
	public String Body() throws IOException
	//public static void main(String args[])
	{
		String filetype = GetDataFromExcel.fromExcel("testData", "postSheet", GetDataFromExcel.keywordIndex("Filetype"), 2);
		String filepath = GetDataFromExcel.fromExcel("testData", "postSheet", GetDataFromExcel.keywordIndex("Filepath"), 2);
		String file = null;
		
		try {
			if(filetype.equals("xml"))
			{
			 file = readXMLAndJsonFile.readFileAsString(filepath);

             System.out.println("xmlfile :: "+file);
			}
			else if(filetype.equals("json")) 
               {
            	   file = readXMLAndJsonFile.readFileAsString(filepath);
               
                     System.out.println("jsonfile :: "+file);
			}
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		return file;
	}
	
}
