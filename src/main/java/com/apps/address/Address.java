package com.apps.address;

public class Address {
	public int id;
	public String city;
	public String state;
	public int pincode;
	public String locallanguage;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String getLocallanguage() {
		return locallanguage;
	}
	public void setLocallanguage(String locallanguage) {
		this.locallanguage = locallanguage;
	}
	@Override
	public String toString() {
		return "Address [id=" + id + ", city=" + city + ", state=" + state + ", pincode=" + pincode + ", locallanguage="
				+ locallanguage + "]";
	}
	

}
