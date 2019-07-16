package springboot.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import springboot.controller.TestController;

@Configuration
@Profile("dev")
public class DevProfileConfig {
	public DevProfileConfig() {
		System.out.println("##########################");
		System.out.println("In dev config");
		System.out.println("##########################");
		TestController.profileBasedMessage = "This is \"DEV\" profile";
	}
}