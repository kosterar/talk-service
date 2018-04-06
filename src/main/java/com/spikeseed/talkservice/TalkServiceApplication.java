package com.spikeseed.talkservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;

@RestController
@SpringBootApplication
public class TalkServiceApplication {


	@GetMapping("/talk")
	public String getTalk() throws UnknownHostException {
		return "Talk details returned by " + InetAddress.getLocalHost().getHostName();
	}

	public static void main(String[] args) {
		SpringApplication.run(TalkServiceApplication.class, args);
	}
}
