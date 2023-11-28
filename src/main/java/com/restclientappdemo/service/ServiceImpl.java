package com.restclientappdemo.service;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.WebClient.ResponseSpec;

import com.bikkadIt.flightApi.model.Flights;

import reactor.core.Disposable;
import reactor.core.publisher.Mono;

@Service
public class ServiceImpl implements ServiceI {

	@Override
	public void getDataRestTemp() {
	System.out.println("Logic to access resource app");
	
	RestTemplate restTemplate=new RestTemplate();
		String url="http://localhost:8080/getAllStudent";
		ResponseEntity<String> forObject = restTemplate.getForEntity(url, String.class);
		System.out.println(forObject);
		String body = forObject.getBody();
		System.out.println(body);
		
		}

	@SuppressWarnings("unchecked")
	@Override
	public void getDataSyncWebClient() {
		String url="http://localhost:8080/getAllStudent";//It will give URL of other application
		WebClient webClient=WebClient.create();//It will create object of WebClient
		String json = webClient.get().uri(url).accept(MediaType.APPLICATION_JSON).retrieve().bodyToMono(String.class).block();
//WebClient wants to get (response) url and WebClient wants data in json format then it will retrive data in String
	//because of Synchronus communication it will block the second transaction upto complition of first transaction
		System.out.println("Hello world...!");
		System.out.println(json);
		System.out.println("Welcome to BikkadIt");
	}

	@Override
	public void getDataASyncWebClient() {
		//String url="http://localhost:8080/getAllStudent";//It will give URL of other application
		
		String url="localhost:9090/getFlightDataASync";
		WebClient webClient=WebClient.create();//It will create object of WebClient
		
		webClient.get().uri(url).accept(MediaType.APPLICATION_JSON).retrieve().bodyToMono(String.class).subscribe(System.out::println);
//WebClient wants to get (response) url and WebClient wants data in json format then it will retrive data in String
	//because of Synchronus communication it will block the second transaction upto complition of first transaction
		
		System.out.println("Hello world...!");
		System.out.println("Welcome to BikkadIt");
		
	}

	@Override
	public 	List<Flights> getDatafromresourceApp() {
		String url="localhost:9090/getFlightDataASync";
		WebClient webClient=WebClient.create();//It will create object of WebClient
		List<Flights> flightsData = (List<Flights>) webClient.get().uri(url).accept(MediaType.APPLICATION_JSON).retrieve().toEntity(Flights.class).subscribe();
		return flightsData;
	}

}
