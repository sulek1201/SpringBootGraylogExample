package com.javaworkshop.demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class DemoApplication {
	public static void main(String[] args) {
		Logger logger = LogManager.getLogger(DemoApplication.class);
		logger.info("Application Start Running...");
		logger.debug("Application Start Running...");
		logger.error("Application Start Running...");
		logger.warn("Application Start Running...");

		SpringApplication.run(DemoApplication.class, args);
	}
}
