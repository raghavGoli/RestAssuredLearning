package com.learning.RestAssured.testScripts;

import java.io.IOException;
import java.util.Properties;
import java.util.Random;
import java.util.Scanner;

import org.testng.ISuite;
import org.testng.ITestContext;
import org.testng.annotations.Test;

import com.learning.RestAssured.HTTPMethods.HTTPMethods;
import com.learning.RestAssured.utilities.jsonFileHandling;
import com.learning.RestAssured.utilities.jsonVariableValue;
import com.learning.RestAssured.utilities.parseJsonUsingJsonPath;
import com.learning.RestAssured.utilities.propertiesFileHandler;

import io.restassured.response.Response;

public class TestCase8_PostMethodReqRes {

	String returnIdVal;

	@Test
	public void testcase8(ITestContext context) throws IOException {

		Properties prop = propertiesFileHandler
				.readPropertiesFile(System.getProperty("user.dir") + "//src//test//resources//URI.properties");
		String requestBodyData = jsonFileHandling
				.readJsonFile(System.getProperty("user.dir") + "//src//test/resources//reqresPayload.json");
		System.out.println("please input the name");
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		String randomVal = "_automation_" + random.nextInt();
		String name = sc.next();
		System.out.println("please input the job");
		String job = sc.next();

		requestBodyData = jsonVariableValue.jsonVariableReplacement("name", name, requestBodyData);
		requestBodyData = jsonVariableValue.jsonVariableReplacement("job", job, requestBodyData);
		requestBodyData = jsonVariableValue.jsonVariableReplacement("id", randomVal, requestBodyData);

		HTTPMethods http = new HTTPMethods(prop);
		Response res = http.postHttpMethod(requestBodyData, "REQRES_URI");
		returnIdVal = parseJsonUsingJsonPath.jsonParsing("id", res);
		// return returnIdVal;

		ISuite suite = context.getSuite();
		suite.setAttribute("returnIdVal", returnIdVal);
	}

}
