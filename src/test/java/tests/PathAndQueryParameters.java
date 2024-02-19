package tests;

import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
import org.json.simple.JSONObject;
import java.util.HashMap;
import org.testng.annotations.Test;


public class PathAndQueryParameters {
	
	
	
	//https://reqres.in/api/users?page=2&id=5
		
		
		@Test
		
		void testQueryPara()
		{
			given()
			
			.pathParam("mypath","users")//path parameter
			.queryParam("page", 2) //query parameter
			.queryParam("id",5 ) //query parameters
			
			.when()
			.get("https://reqres.in/api/{mypath}")
			.then()
			
			.statusCode(200)
			
			.log().all();
			
				
				
			
			
		}

}
