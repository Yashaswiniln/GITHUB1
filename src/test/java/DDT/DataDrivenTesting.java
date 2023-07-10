package DDT;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import POJOCLASS.POJOCREATE;
//import POJOCLASS.PojoForCreate;
import io.restassured.http.ContentType;

public class DataDrivenTesting {
	
	@DataProvider(name="getdata")
	public Object[][] data()
	{
	Object[][] data=new Object[3][2];	
			data[0][0]="yashu";
	data[0][1]="tester";
	data[1][0]="pree";
data[1][1]="dev";
data[2][0]="lavi";
data[2][1]="doctor";

	return data;
	
	}
	@Test(dataProvider="getdata")
	public void createUser(String name,String job)
	{
		baseURI="https://reqres.in";
POJOCREATE pojo = new  POJOCREATE(name,job);

//PRECONDITION
given().body(pojo).contentType(ContentType.JSON)
//action
.when().post("https://reqres.in/api/users")
//validation
.then().assertThat().statusCode(201).log().all();

	}
	
	}


