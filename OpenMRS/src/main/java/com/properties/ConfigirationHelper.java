package com.properties;

import java.io.IOException;

public class ConfigirationHelper {
	public static ConfigirationReader getInstance() throws IOException {
		ConfigirationReader c = new ConfigirationReader();
		return c;
		
	}
	
	private ConfigirationHelper() {
		
	}

}
