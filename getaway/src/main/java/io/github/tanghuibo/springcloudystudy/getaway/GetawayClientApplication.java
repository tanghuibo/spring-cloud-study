package  io.github.tanghuibo.springcloudystudy.getaway;

import io.github.tanghuibo.springcloudystudy.baisc.annotation.EnableWebLogFilter;
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
@EnableWebLogFilter
public class GetawayClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(GetawayClientApplication.class, args);
	}

}
