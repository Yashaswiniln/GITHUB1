package JSON;

import org.testng.annotations.Test;

import POJOCLASS.POJOCREATE;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class pojoClass {
	@Test
	public void pojoclass()
	{
	POJOCREATE p = new POJOCREATE("yashgg","TElll");
		//precondition
		given().body(p).contentType(ContentType.JSON)
		//action
		.when().post("https://reqres.in/api/users")
		//validation
		.then().assertThat().statusCode(201).contentType(ContentType.JSON)
		.log().all();
	}

}
