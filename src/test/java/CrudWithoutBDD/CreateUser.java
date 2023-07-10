package CrudWithoutBDD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
public class CreateUser {
	//create user

	@Test
	public void CreateUser()
	{

JSONObject jobj = new	JSONObject();
jobj.put("name", "yashu");
jobj.put("job","testEngineer");
//1..Precodition
		RequestSpecification resq = RestAssured.given();
		resq.body(jobj);
		resq.contentType(ContentType.JSON);
		//actions
		Response resp=resq.post("https://reqres.in/api/users");
		//valdation
		
     //       System.out.println(resp.getContentType());
   //         System.out.println(resp.prettyPeek());

	//ystem.out.println(resp.asString());
		System.out.println(resp.prettyPrint());
		
		}


	}


