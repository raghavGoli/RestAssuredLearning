package com.learning.RestAssured.utilities;

import org.json.JSONArray;
import org.json.JSONObject;

import io.restassured.response.Response;

public class parseJsonUsingOrgJson {

	public static void parsejson(Response response, String keyname)

	{

		JSONArray jsonarr = new JSONArray(response.asString());
		int length = jsonarr.length();
		for (int i = 0; i < length; i++) {
			JSONObject jsonobj = jsonarr.getJSONObject(i);
			System.out.println("Key name in the JSON Object is::" + jsonobj.get(keyname));

		}

	}
}
