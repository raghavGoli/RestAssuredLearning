package com.learning.RestAssured.testScripts;

import java.io.IOException;
import java.util.Properties;
import java.util.Random;
import org.apache.commons.lang3.RandomStringUtils;
import org.testng.ISuite;
import org.testng.ITestContext;
import org.testng.annotations.Test;

import com.learning.RestAssured.HTTPMethods.HTTPMethods;
import com.learning.RestAssured.utilities.jsonFileHandling;
import com.learning.RestAssured.utilities.jsonVariableValue;
import com.learning.RestAssured.utilities.parseJsonUsingJsonPath;
import com.learning.RestAssured.utilities.propertiesFileHandler;

import io.restassured.response.Response;

public class TestCase1_PostMethod {

	 String returnIdVal;
	
	@Test
	public void testcase1(ITestContext context) throws IOException {

		Properties prop = propertiesFileHandler
				.readPropertiesFile(System.getProperty("user.dir") + "//src//test//resources//URI.properties");
		String requestBodyData = jsonFileHandling
				.readJsonFile(System.getProperty("user.dir") + "//src//test/resources//requestPayload.json");
		Random random = new Random();
		String randomVal = "automation_" + random.nextInt();
		String firstName ="firstName_" +RandomStringUtils.randomAlphabetic(6);
		String lastName ="lastName_" +RandomStringUtils.randomAlphabetic(6);
		//System.out.println("please input the first name");
		//@SuppressWarnings("resource")
		///Scanner sc =new Scanner(System.in);
		//first_name=firstName;
		//System.out.println("please input the last name");
		//String last_name=sc.next();
		
		requestBodyData=jsonVariableValue.jsonVariableReplacement("id", randomVal, requestBodyData);
		requestBodyData=jsonVariableValue.jsonVariableReplacement("firstname", firstName, requestBodyData);
		requestBodyData=jsonVariableValue.jsonVariableReplacement("lastname", lastName, requestBodyData);

		HTTPMethods http = new HTTPMethods(prop);
		Response res =http.postHttpMethod(requestBodyData, "APIStudents_URI");
		returnIdVal =parseJsonUsingJsonPath.jsonParsing("id", res);
		//return returnIdVal;
		 ISuite suite = context.getSuite();
	     suite.setAttribute("returnIdVal", returnIdVal);
	}

}
