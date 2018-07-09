package com.kh.jquery;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JquertController {

	private static final Logger logger = LoggerFactory.getLogger(JquertController.class);
	
	@RequestMapping("jqueryTest1")
	public void jqueryTest1() {
		
	}
}
