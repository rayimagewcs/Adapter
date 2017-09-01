package com.thinvent.middleware.config;

import com.thinvent.library.config.ApplicationConfig;

public class AdapterServiceApplication extends ApplicationConfig {
	public AdapterServiceApplication() { 
		moduleList.add("adapter.spring");
		moduleList.add("adapter.logging");
		moduleList.add("adapter.server");
		moduleList.add("adapter.basic");
	}
}
