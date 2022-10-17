package com.hohuunhan.SpringRestTemplate.controller;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.hohuunhan.SpringRestTemplate.entity.User;

@RestController
@RequestMapping("/user")
public class UserController {

	private final String urlUser = "http://localhost:8081/api/user";

	@Autowired
	RestTemplate restTemplate;

	@PostMapping("/template/products")
	public String getProductList() {
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
//		HttpEntity<User> entity = new HttpEntity<User>(headers);
		User newUser = new User("nhanho123", "12345678", "nhan123zzz@gmail.com", null, null, null);
		return restTemplate.postForEntity(urlUser, newUser, String.class).getBody();
	}
}
