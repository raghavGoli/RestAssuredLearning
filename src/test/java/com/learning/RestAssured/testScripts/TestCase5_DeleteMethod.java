package com.learning.RestAssured.testScripts;

import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

import org.testng.ISuite;
import org.testng.ITestContext;
import org.testng.annotations.Test;

import com.learning.RestAssured.HTTPMethods.HTTPMethods;
import com.learning.RestAssured.utilities.jsonFileHandling;
import com.learning.RestAssured.utilities.jsonVariableValue;
import com.learning.RestAssured.utilities.propertiesFileHandler;

import io.restassured.response.Response;

public class TestCase5_DeleteMethod {

@Test
public void testcase5(ITestContext context) throws IOException {
		

	Properties prop = propertiesFileHandler
			.readPropertiesFile(System.getProperty("user.dir") + "//src//test//resources//URI.properties");
	HTTPMethods http = new HTTPMethods(prop);
	ISuite suite = context.getSuite();
    String returnIDVal = (String) suite.getAttribute("returnIdVal");
   
	Response res =http.deleteHttpMethod("APIStudents_URI",returnIDVal);
	System.out.println(res);
	
	}
}
