package CrudWithoutBDD;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class getUser {
	@Test
	public void getALLUsers()
	{
	Response resp = RestAssured.get("https://reqres.in/api/users?page=2")	;
	resp.then().log().all();
int actstatus = resp.getStatusCode();
System.out.println(actstatus);
Assert.assertEquals(200, actstatus);
System.out.println("tc is passed");
	}

}
