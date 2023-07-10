package CRUDwithBDD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class updateUser {
	@Test
	public void UPDATEuser()
	{
		JSONObject jobj = new	JSONObject();
	jobj.put("name", "yashu");
	jobj.put("job","testEngineer");
		//1:precondition
		given()
		.body(jobj)
		.contentType(ContentType.JSON)
		
	
		//action
		.when()
		.put("https://reqres.in/api/users/2")
		//validation
		.then()
		.assertThat()
		.statusCode(200)
		.contentType(ContentType.JSON)
		.log().all();
		
		
	}

}
