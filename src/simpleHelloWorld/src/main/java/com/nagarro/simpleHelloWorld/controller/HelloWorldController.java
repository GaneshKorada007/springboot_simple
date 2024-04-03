package com.nagarro.simpleHelloWorld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	 @GetMapping("/")
	    public String hello() {
<<<<<<< HEAD
	        return "Hello, world! Thank you";
=======
	        return "Hello, world! thank you";
>>>>>>> 42fec32bbbce56e472a9a690f4ef007b34a2b266
	    }
}
