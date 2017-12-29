package me.rainbowland.coffee.zipkin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.sleuth.zipkin.stream.EnableZipkinStreamServer;

/**
 * Created by lvqiang on 2017/12/29.
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableZipkinStreamServer
public class ZipkinApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZipkinApplication.class, args);
	}
}
