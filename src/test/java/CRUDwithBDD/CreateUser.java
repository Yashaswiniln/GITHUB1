package CRUDwithBDD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class CreateUser {
	@Test
	
public void createUser()
{
		
	
JSONObject jobj = new	JSONObject();
jobj.put("name", "yashu");
jobj.put("job","testEngineer");
//ste1:precondition
given()
.body(jobj)
.contentType(ContentType.JSON)
//step2:actions 
   .when()
.post("https://reqres.in/api/users")
//step3:validation
.then()
.assertThat()
.statusCode(201)
.contentType(ContentType.JSON)
.log().all();
}
}








