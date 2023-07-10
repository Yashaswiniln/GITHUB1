package Package;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;

import org.testng.annotations.Test;

import io.restassured.response.Response;

public class QueryParam {
	@Test
	public void queryparam()
	{
	baseURI="https://reqres.in";
	given().queryParam("page", 3)
	//step1:get all users
	.when().get("/api/users")
	.then().assertThat().statusCode(200).log().all();
	}
}

	


