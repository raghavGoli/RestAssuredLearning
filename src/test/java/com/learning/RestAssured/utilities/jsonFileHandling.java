package com.learning.RestAssured.utilities;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import org.json.JSONObject;
import org.json.JSONTokener;

public class jsonFileHandling {

	public static String readJsonFile(String filePath) throws FileNotFoundException {

		File f = new File(filePath);
		FileReader fr = new FileReader(f);
		JSONTokener jtokener = new JSONTokener(fr);
		JSONObject js = new JSONObject(jtokener);
		return js.toString();

	}
}
