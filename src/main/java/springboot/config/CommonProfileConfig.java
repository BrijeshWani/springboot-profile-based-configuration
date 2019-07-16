package springboot.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import springboot.controller.TestController;

@Configuration
@Profile("devonly")
public class CommonProfileConfig {
	public CommonProfileConfig() {
		System.out.println("##########################");
		System.out.println("In devonly config");
		System.out.println("##########################");
		TestController.profileBasedMessage = "This is \"DEV_ONLY\" profile";
	}
}