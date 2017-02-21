package idv.ted.test.boot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@RequestMapping("/")
	public String helloPage(){
		return "Hello! Spring Boot!";
	}
}
