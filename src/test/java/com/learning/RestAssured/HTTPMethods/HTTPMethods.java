package com.learning.RestAssured.HTTPMethods;

import static io.restassured.RestAssured.*;
import java.util.Properties;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class HTTPMethods {
	Properties prop;

	public HTTPMethods(Properties prop) {
		this.prop = prop;

	}

	public Response postHttpMethod(String payload, String URIkey)

	{
		String URIkeyvalue = prop.getProperty(URIkey);
		Response response = given().contentType(ContentType.JSON).body(payload).post(URIkeyvalue);
		System.out.println("Status code for post Http method:" + response.statusCode());
		System.out.println("Status code for post Http method:" + response.asPrettyString());
		return response;
	}
	
	public Response getAllHttpMethod(String URIkey)

	{
		String URIkeyvalue = prop.getProperty(URIkey);
		Response response = given().contentType(ContentType.JSON).get(URIkeyvalue);
		System.out.println("Status code for getAll Http method:" + response.statusCode());
		System.out.println("Status code for getAll Http method:" + response.asPrettyString());
		return response;
	}
	
	public Response getParticularHttpMethod(String URIkey,String endpoint)

	{
		String URIkeyvalue = prop.getProperty(URIkey)+"/"+endpoint;
		Response response = given().contentType(ContentType.JSON).get(URIkeyvalue);
		System.out.println("Status code for getParticular Http method:" + response.statusCode());
		System.out.println("Status code for getParticular Http method:" + response.asPrettyString());
		return response;
	}
	
	public Response putHttpMethod(String payload, String URIkey,String endpoint)

	{
		String URIkeyvalue = prop.getProperty(URIkey)+"/"+endpoint;
		Response response = given().contentType(ContentType.JSON).body(payload).put(URIkeyvalue);
		System.out.println("Status code for put Http method:" + response.statusCode());
		System.out.println("Status code for put Http method:" + response.asPrettyString());
		return response;
	}
	
	public Response deleteHttpMethod(String URIkey,String endpoint)

	{
		String URIkeyvalue = prop.getProperty(URIkey)+"/"+endpoint;
		Response response = given().contentType(ContentType.JSON).delete(URIkeyvalue);
		System.out.println("Status code for delete Http method:" + response.statusCode());
		System.out.println("Status code for delete Http method:" + response.asPrettyString());
		return response;
	}
}
