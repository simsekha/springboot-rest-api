package com.simsekonline.rest.webservices.restfulwebservices.helloworld;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@Autowired
	private MessageSource messageSource;
	
	@RequestMapping(path="/hello-world")
	public String HelloWorld() {
		return "Hello world";
	}
	
	
	@GetMapping(path="/hello-world-bean")
	public HelloWorldBean HelloWorldBean() {
		return new HelloWorldBean("Hello world");
	}
	
	@GetMapping(path="/hello-world-bean/{name}")
	public HelloWorldBean HelloWorldBean(@PathVariable String name) {
		return new HelloWorldBean("Hello world from "+name);
	}
	
	@RequestMapping(path="/hello-world-internationalized")
	public String HelloWorldInternationalized() {
		return messageSource.getMessage("good.morning.message", null,LocaleContextHolder.getLocale());
	}
	
}
