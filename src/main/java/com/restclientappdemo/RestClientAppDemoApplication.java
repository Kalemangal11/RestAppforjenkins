package com.restclientappdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.restclientappdemo.controller.FlightResourceData;
import com.restclientappdemo.service.ServiceImpl;

@SpringBootApplication
public class RestClientAppDemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(RestClientAppDemoApplication.class, args);
		ServiceImpl bean = run.getBean(ServiceImpl.class);
		//bean.getDataRestTemp();
		//bean.getDataSyncWebClient();
		bean.getDataASyncWebClient();
		
//		FlightResourceData bean2 = run.getBean(FlightResourceData.class);
//		bean2.getAllFlightData();
	}

}
