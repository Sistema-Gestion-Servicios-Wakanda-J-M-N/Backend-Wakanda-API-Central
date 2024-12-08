package org.example.backendwakandaapicentral;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class BackendWakandaApiCentralApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackendWakandaApiCentralApplication.class, args);
	}

}
