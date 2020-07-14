package  io.github.tanghuibo.springcloudystudy.getaway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author thb
 */
@SpringBootApplication
@EnableZuulProxy
@EnableEurekaClient
public class GetawayClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(GetawayClientApplication.class, args);
	}

}
