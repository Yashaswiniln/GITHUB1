package CRUDwithBDD;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class readUser {
	@Test
	public void READuser()
	{
	//step1:precodition
		//step2:actions
	when()
		.get("https://reqres.in/api/users?page=2")
		//step3:validation
		.then()
		.assertThat()
		.statusCode(200)
		.contentType(ContentType.JSON)
		.log().all();
		
	}

}
