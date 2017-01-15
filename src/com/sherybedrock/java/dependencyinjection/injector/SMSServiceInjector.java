package com.sherybedrock.java.dependencyinjection.injector;

import com.sherybedrock.java.dependencyinjection.consumer.Consumer;
import com.sherybedrock.java.dependencyinjection.consumer.MyDIApplication;
import com.sherybedrock.java.dependencyinjection.service.SMSServiceImpl;

public class SMSServiceInjector implements MessageServiceInjector {

	@Override
	public Consumer getConsumer() {
		return new MyDIApplication(new SMSServiceImpl());
	}
}
