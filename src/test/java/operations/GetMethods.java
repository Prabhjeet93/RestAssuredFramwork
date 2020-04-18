package operations;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import genericMethods.genericMethod;
import io.restassured.response.Response;

public class GetMethods {
	
	genericMethod generic = new genericMethod();
	
	
	public void GetMethodwithParam()
	{
	try {
			//String new1 = GetDataFromExcel.fromExcel("genricexcelsheet", "getCustomerSearch2", 1, 0);
			 Response response =  given()
	                    .params(generic.Parameters())
				        .get(generic.URL());
				        
				        
				        response.then().log().all();
				        
				  int code = response.getStatusCode();
				  System.out.println("code :: "+code);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}
	public void GetMethodwithHeaders()
	{
	try {
			//String new1 = GetDataFromExcel.fromExcel("genricexcelsheet", "getCustomerSearch2", 1, 0);
			 Response response =  given()
					 .headers(generic.HeaderInfo())
				        .get(generic.URL());
				        
				        
				        response.then().log().all();
				        
				  int code = response.getStatusCode();
				  System.out.println("code :: "+code);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}
	
	public void GetMethodwithHeadersAndParam()
	{
	try {
			//String new1 = GetDataFromExcel.fromExcel("genricexcelsheet", "getCustomerSearch2", 1, 0);
			 Response response =  given()
	                    .params(generic.Parameters())
	                    .headers(generic.HeaderInfo())
				        .get(generic.URL());
				        
				        
				        response.then().log().all();
				        
				  int code = response.getStatusCode();
				  System.out.println("code :: "+code);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}
	public void GetMethodwithOutHeadersAndParam()
	{
	try {
			//String new1 = GetDataFromExcel.fromExcel("genricexcelsheet", "getCustomerSearch2", 1, 0);
			 Response response =  given()
	                    
				        .get(generic.URL());
				        
				        
				        response.then().log().all();
				        
				  int code = response.getStatusCode();
				  System.out.println("code :: "+code);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}

}
