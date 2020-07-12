package io.github.tanghuibo.springcloudystudy.firstclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author thb
 */
@SpringBootApplication
@EnableEurekaClient
public class FirstClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstClientApplication.class, args);
	}

}
