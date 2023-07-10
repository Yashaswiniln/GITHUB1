package ResponseBoddyValidation;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.when;

import org.testng.Assert;
import org.testng.annotations.Test;

import static  io.restassured.RestAssured.*;
import io.restassured.response.Response;

public class StaticResponseValidation{
	

	@Test
	public void staticResp() {
	
		int expData = 7;
		baseURI="https://reqres.in";
		//step1:get all users
		Response resp = when().get("/api/users?page=2");
	
	//step2 capture the id from request
	int actData = resp.jsonPath().get("data[0].id");
	System.out.println(actData);
	Assert.assertEquals(actData,expData);
	System.out.println("data verified");
	resp.then().log().all();
	
		
	}

}
