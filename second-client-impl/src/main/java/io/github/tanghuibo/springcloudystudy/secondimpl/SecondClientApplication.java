package io.github.tanghuibo.springcloudystudy.secondimpl;

import io.github.tanghuibo.springcloudystudy.baisc.annotation.EnableWebLogFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author thb
 */
@SpringBootApplication
@EnableEurekaClient
@EnableWebLogFilter
@EnableFeignClients
public class SecondClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecondClientApplication.class, args);
	}

}
