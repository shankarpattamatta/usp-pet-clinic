package com.usp.springframework.usppetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VetsController {

	@RequestMapping({"/vets","vets/index.html","vets/index"})
	public String index() {
		return "vets/Index";
	}
}
