package com.hdev.Storage_Service;

import com.hdev.Storage_Service.config.StorageProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
@EnableConfigurationProperties(StorageProperties.class)
public class StorageServiceApplication {
	public static void main(String[] args) {
		SpringApplication.run(StorageServiceApplication.class, args);
	}
}
