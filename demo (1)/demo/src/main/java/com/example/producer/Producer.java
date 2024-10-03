package com.example.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;

@RestController
public class Producer {

	@Autowired
	KafkaTemplate kafkaTemplate;

	@RequestMapping(value = "/send", method = RequestMethod.GET)
	public void sendMessage(@RequestParam String message) {
		System.out.println("message of request param:"+message);
		kafkaTemplate.send("my-topicss",message);
	}

	@RequestMapping(value = "/sending", method = RequestMethod.GET)
	public void sendMessages() {
		System.out.println("message of request param:");

	}
}
