package org.haoloy.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/loy/")
public class LoyController {
	@RequestMapping("test")
	public String test() {
		return "loy";
	}

}
