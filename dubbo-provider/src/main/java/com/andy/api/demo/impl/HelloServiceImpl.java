package com.andy.api.demo.impl;

import org.springframework.stereotype.Component;

import com.andy.api.demo.HelloService;
@Component("helloService")
public class HelloServiceImpl implements HelloService {

	public String sayHello(String name) {
		return name + ",Hello";
	}

}
