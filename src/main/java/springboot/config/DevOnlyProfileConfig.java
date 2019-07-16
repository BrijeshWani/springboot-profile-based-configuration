package springboot.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import springboot.controller.TestController;

@Configuration
@Profile("common")
public class DevOnlyProfileConfig {
	public DevOnlyProfileConfig() {
		System.out.println("##########################");
		System.out.println("In common config");
		System.out.println("##########################");
		TestController.profileBasedMessage = "This is \"COMMON\" profile";
	}
}