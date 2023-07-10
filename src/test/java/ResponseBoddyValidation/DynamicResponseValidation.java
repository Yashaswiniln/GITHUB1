package ResponseBoddyValidation;


import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.when;

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class DynamicResponseValidation {
	@Test
	public void dynamicResp() {
	
		int expData = 7;
		baseURI="https://reqres.in";
		//actions
		Response resp = when().get("/api/users?page=2");
		//validation
boolean		flag=false;
      List<Integer> ids = resp.jsonPath().get("data.id");
      for(Integer id:ids)
      {
    	  if (id.equals(expData))
    	  {
    		  flag=true;
    	  }
      }
	Assert.assertTrue(flag);
	System.out.println("data verified");
	}
}
