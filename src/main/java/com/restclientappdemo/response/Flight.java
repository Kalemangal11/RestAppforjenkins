package com.restclientappdemo.response;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@ToString
public class Flight {
 
	private int fid;
	private String fName;
	private String countryName;
	private String f;
	private String t;
	private String doj;
	private Double ticketPrice;
	}

