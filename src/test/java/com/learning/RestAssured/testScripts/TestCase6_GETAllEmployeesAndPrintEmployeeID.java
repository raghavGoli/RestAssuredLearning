package com.learning.RestAssured.testScripts;

import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

import com.learning.RestAssured.HTTPMethods.HTTPMethods;
import com.learning.RestAssured.utilities.parseJsonUsingJsonPath;
import com.learning.RestAssured.utilities.propertiesFileHandler;

import io.restassured.response.Response;

public class TestCase6_GETAllEmployeesAndPrintEmployeeID {

	@Test
	public void testcase6() throws IOException {
		
		Properties prop=propertiesFileHandler.readPropertiesFile(System.getProperty("user.dir")+"//src//test//resources//URI.properties");
		HTTPMethods http =new HTTPMethods(prop);
		Response resp=http.getAllHttpMethod("REQRES_URI");
		for(int i=0;i<=5;i++)
		{
			System.out.println("employee id are:"+parseJsonUsingJsonPath.jsonParsing("data["+i+"].id", resp));
			
		}
		
		
	}

}
