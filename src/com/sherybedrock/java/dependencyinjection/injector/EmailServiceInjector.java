package com.sherybedrock.java.dependencyinjection.injector;

import com.sherybedrock.java.dependencyinjection.consumer.Consumer;
import com.sherybedrock.java.dependencyinjection.consumer.MyDIApplication;
import com.sherybedrock.java.dependencyinjection.service.EmailServiceImpl;

public class EmailServiceInjector implements MessageServiceInjector {

	@Override
	public Consumer getConsumer() {
		MyDIApplication app = new MyDIApplication();
		app.setService(new EmailServiceImpl());
		return app;
	}
}
