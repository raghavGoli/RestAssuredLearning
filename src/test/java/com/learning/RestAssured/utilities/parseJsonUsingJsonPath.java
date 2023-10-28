package com.learning.RestAssured.utilities;

import io.restassured.response.Response;

public class parseJsonUsingJsonPath {

	public static String jsonParsing(String jsonPath, Response res) {
		return res.jsonPath().get(jsonPath).toString();

	}
}
