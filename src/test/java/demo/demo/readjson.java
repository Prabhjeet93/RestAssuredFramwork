package demo.demo;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.Reader;

import com.fasterxml.jackson.databind.ObjectMapper;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class readjson {
	
	
	public static String readFileAsString(String filePath) throws IOException {
	    DataInputStream dis = new DataInputStream(new FileInputStream(filePath));
	    try {
	        long len = new File(filePath).length();
	        if (len > Integer.MAX_VALUE) throw new IOException("File "+filePath+" too large, was "+len+" bytes.");
	        byte[] bytes = new byte[(int) len];
	        dis.readFully(bytes);
	        return new String(bytes, "UTF-8");
	    } finally {
	        dis.close();
	    }
	}

	public static void main(String[] args) throws IOException {
		String str = readFileAsString("C:\\Users\\prabhjeet.d.singh\\eclipse-workspace\\demo\\src\\main\\java\\demo\\demo\\dem.json");
		System.out.println(str);
		
		ObjectMapper mp=new ObjectMapper();
		File f=new File("C:\\Users\\prabhjeet.d.singh\\eclipse-workspace\\demo\\src\\main\\java\\demo\\demo\\dem.json");
		
		quote qt=mp.readValue(f,quote.class);
		
	}
	
	
}
