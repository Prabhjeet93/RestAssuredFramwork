package operations;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import genericMethods.genericMethod;
import io.restassured.response.Response;

public class PostMethods {
	
	genericMethod generic = new genericMethod();
	
	
	public void postMethodwithParam()
	{
	try {
			 Response response =  given()
	                    .params(generic.Parameters())
	                    .body(generic.Body())
				        .post(generic.URL());
				        
				        
				        response.then().log().all();
				        
				  int code = response.getStatusCode();
				  System.out.println("code :: "+code);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}
	
	@Test
	public void postMethodwithHeaders()
	{
	try {
			
			 Response response =  given()
					 .headers(generic.HeaderInfo())
					 .body(generic.Body())
				        .post(generic.URL());
				        
				        
				        response.then().log().all();
				        
				  int code = response.getStatusCode();
				  System.out.println("code :: "+code);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}
	
	public void postMethodwithHeadersAndParam()
	{
	try {
			
			 Response response =  given()
	                    .params(generic.Parameters())
	                    .headers(generic.HeaderInfo())
	                    .body(generic.Body())
				        .post(generic.URL());
				        
				        
				        response.then().log().all();
				        
				  int code = response.getStatusCode();
				  System.out.println("code :: "+code);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}
	public void postMethodwithOutHeadersAndParam()
	{
	try {
			
			 Response response =  given()
					 
					 .body(generic.Body())
				        .post(generic.URL());
				        
				        
				        response.then().log().all();
				        
				  int code = response.getStatusCode();
				  System.out.println("code :: "+code);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}

}
