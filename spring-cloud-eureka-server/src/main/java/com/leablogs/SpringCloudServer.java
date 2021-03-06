package com.leablogs;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

import java.util.concurrent.ConcurrentHashMap;

@SpringBootApplication
@EnableEurekaServer
public class SpringCloudServer {
	public static void main(String[] args) throws Exception {
		SpringApplication.run(SpringCloudServer.class, args);
	}

}
