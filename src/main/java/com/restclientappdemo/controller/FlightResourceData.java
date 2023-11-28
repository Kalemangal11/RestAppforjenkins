package com.restclientappdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bikkadIt.flightApi.model.Flights;
import com.restclientappdemo.service.ServiceImpl;
@RestController
public class FlightResourceData {

	@Autowired
	private ServiceImpl ServiceImpl;
	
	@GetMapping(value="/getFlightDatatoClient",produces="application/json")
	public ResponseEntity<List<Flights>> getAllFlightData() {
		 List<Flights> flightData = ServiceImpl.getDatafromresourceApp();
		return new ResponseEntity<List<Flights>>(flightData,HttpStatus.OK);
	}	
}
