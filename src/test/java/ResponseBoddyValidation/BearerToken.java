package ResponseBoddyValidation;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class BearerToken {
	@Test
	public void bearetoken()
	
	{
	baseURI="https://api.github.com";
JSONObject jobj = new JSONObject();
jobj.put("name", "online_Rest1");
//step1=preCondition
given().auth().oauth2("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")
.body(jobj).contentType(ContentType.JSON)
//step2=actions
.when().post("/user/repos")
//step3=validation
.then().assertThat().statusCode(201).log().all();
	}

}
