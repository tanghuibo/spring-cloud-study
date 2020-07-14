package io.github.tanghuibo.springcloudystudy.firstclient;

import io.github.tanghuibo.springcloudystudy.baisc.annotation.EnableWebLogFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author thb
 */
@SpringBootApplication
@EnableEurekaClient
@EnableWebLogFilter
public class FirstClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstClientApplication.class, args);
	}

}
