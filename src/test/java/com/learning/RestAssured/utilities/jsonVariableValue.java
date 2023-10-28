package com.learning.RestAssured.utilities;

import java.util.regex.Pattern;

public class jsonVariableValue {

	public static String jsonVariableReplacement(String variableName, String variableValue, String requestBody) {

		requestBody = requestBody.replaceAll(Pattern.quote("{{" + variableName + "}}"), variableValue);
		return requestBody;
	}
}
