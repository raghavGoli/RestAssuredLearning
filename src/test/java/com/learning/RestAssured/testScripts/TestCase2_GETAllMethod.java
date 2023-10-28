package com.learning.RestAssured.testScripts;

import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

import com.learning.RestAssured.HTTPMethods.HTTPMethods;
import com.learning.RestAssured.utilities.parseJsonUsingOrgJson;
import com.learning.RestAssured.utilities.propertiesFileHandler;

import io.restassured.response.Response;

public class TestCase2_GETAllMethod {

	@Test
	public void testcase2() throws IOException {
		
		Properties prop=propertiesFileHandler.readPropertiesFile(System.getProperty("user.dir")+"//src//test//resources//URI.properties");
		HTTPMethods http =new HTTPMethods(prop);
		Response resp=http.getAllHttpMethod("APIStudents_URI");
		parseJsonUsingOrgJson.parsejson(resp, "id");

	}

}
