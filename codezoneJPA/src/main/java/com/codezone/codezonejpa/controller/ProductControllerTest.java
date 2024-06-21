package com.codezone.codezonejpa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProductControllerTest {

	
	@RequestMapping("/")
	public String m1() {
		return "connected";
	}
	

}
