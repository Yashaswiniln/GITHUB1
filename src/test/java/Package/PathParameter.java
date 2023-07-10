package Package;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class PathParameter {
	@Test
	public void requestChain()
	{
	baseURI="https://reqres.in";
	//step1:get all users
	Response resp = when().get("/api/users?page=2");
resp.then().log().all();
//step2 capture the id from request
int id = resp.jsonPath().get("data[2].id");
System.out.println(id);
//step3 use the id in another request
given().pathParam("uid", id)
.when().get("/api/users/"+id)
.then().assertThat().statusCode(200).contentType(ContentType.JSON)
.log().all();
	
	}

}
	





