package com.sudhanshu.activemq;

import javax.jms.Queue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Producer {
	
	@Autowired
	private JmsTemplate jmsTemplate;
	
	@Autowired
	private Queue queue;
	
	@RequestMapping("/{message}")
	public String publish(@PathVariable String message) {
		
		jmsTemplate.convertAndSend(queue, message);
		
		return "message published";
	}
}
