package  io.github.tanghuibo.springcloudystudy.getaway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author thb
 */
@SpringBootApplication
@EnableDiscoveryClient
public class GetawayClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(GetawayClientApplication.class, args);
	}

}
