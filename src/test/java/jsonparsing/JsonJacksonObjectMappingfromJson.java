package jsonparsing;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
 
import com.fasterxml.jackson.databind.ObjectMapper;

 
public class JsonJacksonObjectMappingfromJson {
 
    public static void main(String args[]){
         
        ObjectMapper mapper = new ObjectMapper();
 
        /**
         * Read object from file
         */
        CarFleet value = null;
        try {
            value = mapper.readValue(new File("result.json"), CarFleet.class);
        } catch (Exception e) {
            e.printStackTrace();
        }   
         
        System.out.println(value);
         
    }
     
}
