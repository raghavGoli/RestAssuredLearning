package com.learning.RestAssured.testScripts;

import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

import com.learning.RestAssured.HTTPMethods.HTTPMethods;
import com.learning.RestAssured.utilities.propertiesFileHandler;

import io.restassured.response.Response;

public class TestCase7_GETParticularReqRes {

@Test
public void testcase7() throws IOException {
		
		Properties prop=propertiesFileHandler.readPropertiesFile(System.getProperty("user.dir")+"//src//test//resources//URI.properties");
		HTTPMethods http =new HTTPMethods(prop);
		Response resp=http.getParticularHttpMethod("REQRES_URI","3");
		System.out.println(resp.asPrettyString());
	}
}
