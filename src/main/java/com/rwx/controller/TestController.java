package com.rwx.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ResponseEntity<?> helloWord() {
		System.out.println("helloWord");
		return ResponseEntity.ok("helloWord");
	}
}
