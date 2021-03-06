package com.ebsco.eis.dmp2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {
	    "com.ebsco.common.logging",
	    "com.ebsco.eis.beanbag",
	    "com.ebsco.eis.dmp2",
	    "com.ebsco.eis.dynamichealth.elasticsearch.beans"
	})
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
