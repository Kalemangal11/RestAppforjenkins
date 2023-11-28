package com.restclientappdemo.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.bikkadIt.flightApi.model.Flights;

import reactor.core.publisher.Mono;


public interface ServiceI {

	//public List<Flights> getDatafromresourceApp();
	public 	List<Flights> getDatafromresourceApp();
	
	public void getDataRestTemp();
	
	public void getDataSyncWebClient();
	
	public void getDataASyncWebClient();
	
	
	
}
