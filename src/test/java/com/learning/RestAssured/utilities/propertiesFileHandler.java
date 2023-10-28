package com.learning.RestAssured.utilities;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class propertiesFileHandler {

	public static Properties readPropertiesFile(String filePath) throws IOException {

		File f = new File(filePath);
		FileReader fr = new FileReader(f);
		Properties prop = new Properties();
		prop.load(fr);
		return prop;
	}
}
