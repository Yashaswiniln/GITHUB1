package JSON;

import static io.restassured.RestAssured.given;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.hamcrest.Matcher;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class CresteWithHashmap {
	@Test
	public void createHASSHmap()
	{
HashMap H = new HashMap();	
H.put("name", "yashu");
H.put("job", "IT");
//PRECONDITION
given().body(H).contentType(ContentType.JSON)
//action
.when().post("https://reqres.in/api/users")
//validation
.then().assertThat().statusCode(201).contentType(ContentType.JSON)

	.time(Matchers.lessThan(5000L),TimeUnit.MILLISECONDS)
	.log().all();
}

	
	}




	


