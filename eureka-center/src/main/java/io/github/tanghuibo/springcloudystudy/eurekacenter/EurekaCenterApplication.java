package io.github.tanghuibo.springcloudystudy.eurekacenter;

import io.github.tanghuibo.springcloudystudy.baisc.annotation.EnableWebLogFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author thb
 */
@SpringBootApplication
@EnableEurekaServer
@EnableWebLogFilter
public class EurekaCenterApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaCenterApplication.class, args);
	}

}
