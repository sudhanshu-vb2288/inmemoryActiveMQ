package com.sudhanshu.activemq;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class Consumer {

	@JmsListener (destination="myActiveMq.queue")
	public void listen(String message) {
		System.out.println("Received Message: "+message);
	}
}
