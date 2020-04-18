/*package genericMethods;

import static io.restassured.RestAssured.given;

import java.util.HashMap;

import org.testng.annotations.Test;

import io.restassured.path.xml.XmlPath;
import io.restassured.response.Response;

public class GenericPostMethods {

	@Test
	public void genericpostMethod1()
	{
		String xml2  = "";
		
		String URL =  "";
		
		HashMap<String,String> header = new HashMap<String, String>();
		
		header.put("Content-Type", "application/soap+xml;charset=UTF-8");
		
		
		Response response = null;
		//response.getStatusCode();
		int statuscode = 0;
		try {
			response = given()
			.headers(header)
			.body(xml2).
			when().
			post(URL);
			
			response.then().log().all();
			statuscode = response.getStatusCode();
			
			statuscode = response.getStatusCode();
			if(statuscode==200) {
				System.out.println("Response Staus Code is :: "+statuscode);
				
			}
			else {
				System.out.println("Response Staus Code is not as expected :: "+statuscode);
				
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		String body = response.getBody().asString();
		System.out.println(body);
		
		//String responseString = response.asString();
		
		
			 XmlPath xmlpath = new XmlPath(body);
			 
			 String str1 = xmlpath.getString("<pass parameter name>");
			    
			    System.out.println("str1 :: "+str1);
			 
		        String message = xmlpath.getString("<pass parameter name>");
		
		   System.out.println("message :: "+message);
			
			if(statuscode==200) {
				System.out.println("Response Staus Code is :: "+statuscode);
				//Reporter.addStepLog("Entering UserID and Password Failed at: " + e1 + "" + Result.FAILED);
			}
			else {
				System.out.println("Response Staus Code is not as expected :: "+statuscode);
			}
		
	}
}
*/