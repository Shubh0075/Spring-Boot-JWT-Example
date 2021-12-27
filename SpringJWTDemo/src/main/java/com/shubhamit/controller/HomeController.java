package com.shubhamit.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class HomeController {

	@GetMapping("/admin/get-data")
	public String getAdminData() {
		return "Admin Visible Data!";
	}

	@GetMapping("/customer/get-data")
	public String getCustomerData() {
		return "Customer Visible Data!";
	}

}
