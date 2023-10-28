package com.learning.RestAssured.testScripts;

import java.io.IOException;
import java.util.Properties;

import org.testng.ISuite;
import org.testng.ITestContext;
import org.testng.annotations.Test;

import com.learning.RestAssured.HTTPMethods.HTTPMethods;
import com.learning.RestAssured.utilities.propertiesFileHandler;

import io.restassured.response.Response;

public class TestCase10_DeleteMethod_ReqRes {

@Test
public void testcase10(ITestContext context) throws IOException {
		

	Properties prop = propertiesFileHandler
			.readPropertiesFile(System.getProperty("user.dir") + "//src//test//resources//URI.properties");
	HTTPMethods http = new HTTPMethods(prop);
	ISuite suite = context.getSuite();
    String returnIDVal = (String) suite.getAttribute("returnIdVal");
    
	Response res =http.deleteHttpMethod("REQRES_URI",returnIDVal);
	System.out.println(res);
	
	}
}
