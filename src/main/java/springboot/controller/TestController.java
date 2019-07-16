package springboot.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/profile")
public class TestController {

	public static String profileBasedMessage;

	@GetMapping("/get-config")
	public @ResponseBody ResponseEntity<String> test() {
		return ResponseEntity.status(HttpStatus.OK).body(profileBasedMessage);
	}
}
