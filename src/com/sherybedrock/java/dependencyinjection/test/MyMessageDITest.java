package com.sherybedrock.java.dependencyinjection.test;

import com.sherybedrock.java.dependencyinjection.consumer.Consumer;
import com.sherybedrock.java.dependencyinjection.injector.EmailServiceInjector;
import com.sherybedrock.java.dependencyinjection.injector.MessageServiceInjector;
import com.sherybedrock.java.dependencyinjection.injector.SMSServiceInjector;

public class MyMessageDITest {

	public static void main(String[] args) {
		String msg = "Hi Sherybedrock";
		String email = "vab_bedrocksity@abv.bg";
		String phone = "+359 887204769";
		MessageServiceInjector injector = null;
		Consumer app = null;
		
		//Send email
		injector = new EmailServiceInjector();
		app = injector.getConsumer();
		app.processMessages(msg, email);
		
		//Send SMS
		injector = new SMSServiceInjector();
		app = injector.getConsumer();
		app.processMessages(msg, phone);
	}

}
