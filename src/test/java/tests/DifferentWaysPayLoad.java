package tests;


import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
import static io.restassured.RestAssured.*;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import groovy.json.JsonLexer;

public class DifferentWaysPayLoad {
	
	//post request body using org.json library.
	
	
	@Test(enabled=false)
	
	void testPostUsingJsonLibrary()
	{
		
		JSONObject data = new JSONObject();
		
		data.put("name", "Scott");
		
		data.put("job", "Teacher");
		
		
		given()
		.contentType("application/json")
		.body(data.toString())
		
		.when()
		.post("https://reqres.in/api/users")
		
		.then()
		.statusCode(201)
		.log().all();
				
}
	
	@Test
	
	void testPostUsingPOJO()
	{
		Pojo_PostRequest data = new Pojo_PostRequest();
		
		data.setName("Sam");
		data.setJob("Actor");
		
		given()
		.contentType("application/json")
		.body(data)
		
		.when()
		.post("https://reqres.in/api/users")
		
		.then()
		.statusCode(201)
		.log().all();
		
	}
	//Extrnal Json file
	
	@Test
	
	void extrnalJsonFile()
	{
		
		
	
		
		
		
		
		
		
		
		
	}
	
	
}
