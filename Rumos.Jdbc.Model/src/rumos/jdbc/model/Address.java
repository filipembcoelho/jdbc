package rumos.jdbc.model;

import java.util.List;

public class Address {
	private int id;
	private String streetOne;
	private String streetTwo;
	private String city;
	private String zipCode;
	private String country;
	private boolean isMain;
	private List<User> users;

	public Address(String streetOne, String city, String zipCode, String country) {
		this.streetOne = streetOne;
		this.city = city;
		this.zipCode = zipCode;
		this.country = country;
	}

	public String getStreetOne() {
		return streetOne;
	}

	public void setStreetOne(String streetOne) {
		this.streetOne = streetOne;
	}

	public String getStreetTwo() {
		return streetTwo;
	}

	public void setStreetTwo(String streetTwo) {
		this.streetTwo = streetTwo;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

}