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

public class TestCase4_UpdateMethod {

	@Test
public void testcase4(ITestContext context) throws IOException {
		

	Properties prop = propertiesFileHandler
			.readPropertiesFile(System.getProperty("user.dir") + "//src//test//resources//URI.properties");
	String requestBodyData = jsonFileHandling
			.readJsonFile(System.getProperty("user.dir") + "//src//test/resources//requestPayload.json");
	System.out.println("please input the first name to update");
	
	Scanner sc =new Scanner(System.in);
	String first_name=sc.next();
	System.out.println("please input the last name to update");
	String last_name=sc.next();
	ISuite suite = context.getSuite();
    String returnIDVal = (String) suite.getAttribute("returnIdVal");
   
	requestBodyData=jsonVariableValue.jsonVariableReplacement("id", returnIDVal, requestBodyData);
	requestBodyData=jsonVariableValue.jsonVariableReplacement("firstname", first_name, requestBodyData);
	requestBodyData=jsonVariableValue.jsonVariableReplacement("lastname", last_name, requestBodyData);

	HTTPMethods http = new HTTPMethods(prop);
	Response res =http.putHttpMethod(requestBodyData, "APIStudents_URI",returnIDVal);
	System.out.println(res);
	
	}
}
