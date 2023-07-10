package JSON;

import static io.restassured.RestAssured.*;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.assertion.ResponseTimeMatcher;
import io.restassured.http.ContentType;

public class JSONfile {
	@Test
	public void jsonfil()
	{
		File file = new File("src\\test\\resources\\ya.json");
		//step1-precondition
		given().body(file).contentType(ContentType.JSON)
		//2actios
		.when().post("https://reqres.in/api/users")
		//validation
		.then().assertThat().statusCode(201).contentType(ContentType.JSON)
		.log().all();
	//	.time(Matchers.lessThan(30L),TimeUnit.MILLISECONDS)
	}
}
