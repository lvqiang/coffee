package me.rainbowland.coffee.service.hello.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lvqiang on 2017/11/21.
 */
@RestController
public class HelloController {

	@Autowired
	private DiscoveryClient discoveryClient;

	@GetMapping("/")
	public String home(){
		return "hello world!";
	}

	@GetMapping("/name")
	public String name(String name) {
		return "hello " + name;
	}

	@GetMapping("/info")
	public String getInfo(){
		ServiceInstance serviceInstance=discoveryClient.getLocalServiceInstance();
		return serviceInstance.getServiceId()+"@"+serviceInstance.getHost()+":"+serviceInstance.getPort();
	}
}
