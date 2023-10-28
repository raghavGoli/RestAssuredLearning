package com.learning.RestAssured.Runner;

import java.io.IOException;

import com.learning.RestAssured.testScripts.TestCase10_DeleteMethod_ReqRes;
import com.learning.RestAssured.testScripts.TestCase6_GETAllEmployeesAndPrintEmployeeID;
import com.learning.RestAssured.testScripts.TestCase7_GETParticularReqRes;
import com.learning.RestAssured.testScripts.TestCase8_PostMethodReqRes;
import com.learning.RestAssured.testScripts.TestCase9_UpdateMethod_ReqRes;

public class ExecutionRunner2 {

	public static void main(String[] args) throws IOException {

		TestCase6_GETAllEmployeesAndPrintEmployeeID testcase6Obj = new TestCase6_GETAllEmployeesAndPrintEmployeeID();
		testcase6Obj.testcase6();
		TestCase7_GETParticularReqRes testcase7Obj = new TestCase7_GETParticularReqRes();
		testcase7Obj.testcase7();
		
		TestCase8_PostMethodReqRes testcase8Obj = new TestCase8_PostMethodReqRes();
		testcase8Obj.testcase8(null);
	
		TestCase9_UpdateMethod_ReqRes testcase9Obj = new TestCase9_UpdateMethod_ReqRes();
		testcase9Obj.testcase9(null);
		
		TestCase10_DeleteMethod_ReqRes testcase10Obj = new TestCase10_DeleteMethod_ReqRes();
		testcase10Obj.testcase10(null);
	}

}
