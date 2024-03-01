package LMS.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ApplicationController {

	@GetMapping("/")
	public String launchHomePage() {
		return "Home";
	}
	
	@GetMapping("/Home")
	public String launchHomePage1() {
		return "Home";
	}
}
