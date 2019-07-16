package springboot.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import springboot.controller.TestController;

@Configuration
@Profile("test")
public class TestProfileConfig {
	public TestProfileConfig() {
		System.out.println("##########################");
		System.out.println("In test config");
		System.out.println("##########################");
		TestController.profileBasedMessage = "This is \"TEST\" profile";
	}
}
