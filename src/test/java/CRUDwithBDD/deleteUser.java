package CRUDwithBDD;

import org.testng.annotations.Test;

//import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class deleteUser {
	@Test
	public void DeleteUSER()
	{
		//1precondition
		//2acton
		when()
		.delete("https://reqres.in/api/users/2")
		
		//validation
	.then()
		.assertThat()
		.statusCode(204)
		
		.log().all();
		
	}

}
