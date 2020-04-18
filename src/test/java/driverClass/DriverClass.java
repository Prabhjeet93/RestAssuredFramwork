package driverClass;

import org.testng.annotations.Test;

import operations.GetMethods;
import operations.PostMethods;

public class DriverClass {
	
	GetMethods get = new GetMethods();
	PostMethods post = new 	PostMethods();
	
	public  void DriverMethod(String operation1,String operation2)
	{
		//Test data sheet path not required
		//
		switch(operation1)
		{
		  
		   case "Get" :
		     switch(operation2)
		     {
		     case "GetMethodwithParam" :
		    	 get.GetMethodwithParam();
		    	
		     case "GetMethodwithHeaders" :
		    	 get.GetMethodwithHeaders();
		    	 
		     case "GetMethodwithHeadersAndParam" :
		    	 get.GetMethodwithHeadersAndParam();
		    	 
		     case "GetMethodwithOutHeadersAndParam" :
		    	 get.GetMethodwithOutHeadersAndParam();
		     }
			   
		      break; 
		   
		   case "Post" :
			   
			   switch(operation2)
			     {
			     case "postMethodwithParam" :
			    	 post.postMethodwithParam();
			    	
			     case "postMethodwithHeaders" :
			    	 post.postMethodwithHeaders();
			    	 
			     case "postMethodwithHeadersAndParam" :
			    	 post.postMethodwithHeadersAndParam();
			    	 
			     case "postMethodwithOutHeadersAndParam" :
			    	 post.postMethodwithOutHeadersAndParam();
			     }
		     
		      break;
		   
		   
		   default : 
		      System.out.println("Your  Operation does not Exits");
		}

	}

	
	public static void mani(String[] args) {
		DriverClass dc = new DriverClass();
		dc.DriverMethod("postMethodwithOutHeadersAndParam", "GetMethodwithParam");
	}
}
