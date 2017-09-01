package com.thinvent.middleware;

import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.thinvent.library.config.InitService;
import com.thinvent.library.config.ServiceConfig;
import com.thinvent.library.util.SpringContextUtil;
import com.thinvent.library.util.StringUtil;
import com.thinvent.middleware.config.AdapterServiceApplication;
import com.thinvent.middleware.pubsub.AdapterServiceSubscribe;

@SpringBootApplication
public class MidlewareApplication {
	public static void main(String[] args) throws IOException, Exception {
		InitService.init(new AdapterServiceSubscribe(), new AdapterServiceApplication().moduleList,	StringUtil.getConfigDir(args));
		SpringApplication application = new SpringApplication(MidlewareApplication.class);
		application.setDefaultProperties(ServiceConfig.loadSpringConfig("adapter"));
		ApplicationContext app = application.run(args);
		SpringContextUtil.setApplicationContext(app);
	}
}
