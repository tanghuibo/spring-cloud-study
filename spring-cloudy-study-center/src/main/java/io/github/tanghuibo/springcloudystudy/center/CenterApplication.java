package io.github.tanghuibo.springcloudystudy.center;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author thb
 */
@SpringBootApplication
@EnableEurekaServer
public class CenterApplication {

	public static void main(String[] args) {
		SpringApplication.run(CenterApplication.class, args);
	}

}
