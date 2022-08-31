package com.session.immutable;

public class Address {

	private String city;
	private String State;
	private String Country;
	private String Continent;

	public Address(String city, String state, String country, String continent) {
		this.city = city;
		State = state;
		Country = country;
		Continent = continent;
	}

	public Address(String city, String state, String country) {
		this.city = city;
		State = state;
		Country = country;
	}

	public Address(Address address) {
		this(address.getCity(), address.getState(), address.getCountry(), address.getContinent());
	}

	public String getCity() {
		return city;
	}

	public String getState() {
		return State;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setState(String state) {
		State = state;
	}

	public String getCountry() {
		return Country;
	}

	public void setCountry(String country) {
		Country = country;
	}

	public String getContinent() {
		return Continent;
	}

	public void setContinent(String continent) {
		Continent = continent;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", State=" + State + ", Country=" + Country + ", Continent=" + Continent + "]";
	}

}
