package com.thinvent.middleware.config;

import com.thinvent.library.config.ApplicationConfig;

public class AdapterServiceApplication extends ApplicationConfig {
	public AdapterServiceApplication() { 
		moduleList.add("middleware.spring");
		moduleList.add("middleware.logging");
		moduleList.add("middleware.server");
		moduleList.add("middleware.basic");
	}
}
