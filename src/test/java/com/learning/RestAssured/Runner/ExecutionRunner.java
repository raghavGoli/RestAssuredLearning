package com.learning.RestAssured.Runner;

import java.io.IOException;

import com.learning.RestAssured.testScripts.TestCase1_PostMethod;
import com.learning.RestAssured.testScripts.TestCase2_GETAllMethod;
import com.learning.RestAssured.testScripts.TestCase3_GETParticular;
import com.learning.RestAssured.testScripts.TestCase4_UpdateMethod;
import com.learning.RestAssured.testScripts.TestCase5_DeleteMethod;

public class ExecutionRunner {

	public static void main(String[] args) throws IOException {
		
		TestCase1_PostMethod testcase1Obj =new TestCase1_PostMethod();
		TestCase2_GETAllMethod testcase2Obj=new  TestCase2_GETAllMethod();
		TestCase3_GETParticular testcase3Obj=new  TestCase3_GETParticular();
		TestCase4_UpdateMethod testcase4Obj=new TestCase4_UpdateMethod();
		TestCase5_DeleteMethod testcase5Obj=new TestCase5_DeleteMethod();
		
		testcase1Obj.testcase1(null);
		testcase2Obj.testcase2();
		testcase3Obj.testcase3(null);
		testcase4Obj.testcase4(null);
		testcase5Obj.testcase5(null);
	}

}
