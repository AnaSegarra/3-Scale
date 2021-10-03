package com.developer.games.challenge5;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.dekorate.openshift.annotation.OpenshiftApplication;

@SpringBootApplication
@OpenshiftApplication(name = "challenge-5-3scale")
public class Challenge5Application {

	public static void main(String[] args) {
		SpringApplication.run(Challenge5Application.class, args);
	}

}
