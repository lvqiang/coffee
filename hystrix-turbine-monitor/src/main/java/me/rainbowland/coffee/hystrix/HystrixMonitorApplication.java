package me.rainbowland.coffee.hystrix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.turbine.stream.EnableTurbineStream;

/**
 * Created by lvqiang on 2017/12/12.
 */
@SpringBootApplication
@EnableTurbineStream
@EnableHystrixDashboard
public class HystrixMonitorApplication {

	public static void main(String[] args) {
		SpringApplication.run(HystrixMonitorApplication.class, args);
	}
}
