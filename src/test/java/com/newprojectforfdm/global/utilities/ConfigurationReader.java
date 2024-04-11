package com.newprojectforfdm.global.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {

	public static String getProperty(String moduleName, String propertyKey) {

		Properties config = new Properties();

		String path = "src/test/resources/Properties/";

		try {

			config.load(new FileInputStream(path + moduleName + ".properties"));

		} catch (IOException e) {

			e.printStackTrace();

		}

		for (String key : config.stringPropertyNames()) {

			if (key.equals(propertyKey)) {

				return config.getProperty(key);

			}

		}
		
		return "Invalid property key!!";

	}
}