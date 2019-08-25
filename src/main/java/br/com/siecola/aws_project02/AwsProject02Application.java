package br.com.siecola.aws_project02;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AwsProject02Application {
	private static final Logger log = LoggerFactory.getLogger(
			AwsProject02Application.class);

	public static void main(String[] args) {
		SpringApplication.run(AwsProject02Application.class, args);

		log.info("Version 0.4.1");
	}

}
