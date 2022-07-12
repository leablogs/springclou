package com.leablogs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringCloudConfigClient {
	public static void main(String[] args) throws Exception {
		SpringApplication.run(SpringCloudConfigClient.class, args);
	}

}
