package com.learning.RestAssured.testScripts;

import java.io.IOException;
import java.util.Properties;
import java.util.Random;
import java.util.Scanner;

import org.apache.commons.lang3.RandomStringUtils;
import org.testng.ISuite;
import org.testng.ITestContext;
import org.testng.annotations.Test;

import com.learning.RestAssured.HTTPMethods.HTTPMethods;
import com.learning.RestAssured.utilities.jsonFileHandling;
import com.learning.RestAssured.utilities.jsonVariableValue;
import com.learning.RestAssured.utilities.propertiesFileHandler;

import io.restassured.response.Response;

public class TestCase9_UpdateMethod_ReqRes {

@Test	
public void testcase9(ITestContext context) throws IOException {
		

	Properties prop = propertiesFileHandler
			.readPropertiesFile(System.getProperty("user.dir") + "//src//test//resources//URI.properties");
	String requestBodyData = jsonFileHandling
			.readJsonFile(System.getProperty("user.dir") + "//src//test/resources//reqresPayload.json");
	System.out.println("please input the name");
	//Scanner sc =new Scanner(System.in);
	Random random = new Random();
	String randomVal = "_automation_" + random.nextInt();
	//String name=sc.next();
	//System.out.println("please input the job");
	//String job=sc.next();
	
	String firstName ="firstName_" +RandomStringUtils.randomAlphabetic(3);
	String lastName ="lastName_" +RandomStringUtils.randomAlphabetic(3);
	String name =firstName+lastName;
	String job = "SDET_"+RandomStringUtils.randomAlphanumeric(6);
	
	
	
	ISuite suite = context.getSuite();
    String returnIDVal = (String) suite.getAttribute("returnIdVal");
    
	requestBodyData=jsonVariableValue.jsonVariableReplacement("name", name, requestBodyData);
	requestBodyData=jsonVariableValue.jsonVariableReplacement("job", job, requestBodyData);
	requestBodyData=jsonVariableValue.jsonVariableReplacement("id", randomVal, requestBodyData);
	
	HTTPMethods http = new HTTPMethods(prop);
	Response res =http.putHttpMethod(requestBodyData, "REQRES_URI",returnIDVal);
	System.out.println(res);
	
	}
}
