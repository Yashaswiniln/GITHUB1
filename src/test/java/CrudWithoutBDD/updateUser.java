package CrudWithoutBDD;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class updateUser {
	@Test
	public void UpdateUsers()
	{

JSONObject jobj = new	JSONObject();
jobj.put("name", "yashu");
jobj.put("job","testEngineer");

		//step1=precondition
	RequestSpecification req = RestAssured.given();
	req.body(jobj);
	req.contentType(ContentType.JSON);
	//step2:action
	Response resp=req.put("https://reqres.in/api/users/2");
	resp.then().log().all();
int actstatus = resp.getStatusCode();
System.out.println(actstatus);
Assert.assertEquals(200, actstatus);
System.out.println("tc is passed");
	

         System.out.println(resp.getContentType());
        //  System.out.println(resp.prettyPeek());

	}
	

}
