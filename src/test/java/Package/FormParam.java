package Package;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import  io.restassured.http.ContentType;

public class FormParam {
	@Test
	public void formparameter()
	{
		
	baseURI="https://reqres.in";
	given()
	.formParam("name","yashu")
	.formParam("job","tester")
	.contentType(ContentType.JSON)
	.when().post("api/users")
	.then().assertThat().statusCode(201).log().all();

}
}
