package com.outsight.service2.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Service2Controller {
	
	@Value(value="${application.name}")
	private String appName;
	
	@RequestMapping(value = "hello", method = RequestMethod.GET)
	@ResponseBody
	public String find(@RequestParam(value = "name", required = true) String name)
			throws Exception 
	{
		return "hello " + name + ", \\/ greetings from " + appName;
	}	

}