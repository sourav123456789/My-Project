package com.example.scheduling;

import java.util.Date;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@SpringBootApplication
public class SchedulingWithSpringBootApplication {
	private static final Logger log = LoggerFactory.getLogger(SchedulingWithSpringBootApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SchedulingWithSpringBootApplication.class, args);
	}

	/* cron =sec, min, hour, day-of-month, month, day-of-week */
	@Scheduled(cron = "5 * * * * *")
	void somejob() throws InterruptedException {
		log.info("some-Job is :::-->" + new Date());
	}
}

@EnableScheduling
@Configuration
class schedulingConfig {

}
