package com.black_boy_tutorial_1.black_boy_tutorial_1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {

	@GetMapping("/show")
	public String show() {
		return "Hello Tushar";
	}
}
