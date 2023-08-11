package edu.yacoubi.classicmodels;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.security.SecureRandom;

@SpringBootApplication
public class Main {
	private static final Logger LOGGER = LoggerFactory.getLogger(Main.class);
	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
		String logging = "Simple log statement with inputs {}, {} and {}";

		System.out.println();
		System.out.println();
		LOGGER.info("\u001B[32m"+ logging + "\u001B[0m", 1, 2, 3); // green
		LOGGER.error("\u001B[31m" + logging + "\u001B[0m", 1, 2, 3); // red
	}
}
