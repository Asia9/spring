package com.amdocs.amdocs123;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class tech {
	@GetMapping("/in")
	public String show() {
		return "welcome to spring boot and jenkins";
	}

}
