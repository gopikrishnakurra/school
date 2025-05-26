package com.manufacturer;

public class manufacturer {
	private String manufactureName;
	private String manufactureAddres;
	private String registrationNumber;
	
	//constructor
	private manufacturer(String manufactureName, String manufactureAddres, String registrationNumber) {
		super();
		this.manufactureName = manufactureName;
		this.manufactureAddres = manufactureAddres;
		this.registrationNumber = registrationNumber;
	}
	@Override
	public String toString() {
		return "manufacturer [manufactureName=" + manufactureName + ", manufactureAddres=" + manufactureAddres
				+ ", registrationNumber=" + registrationNumber + "]";
	}
	public String getManufactureName() {
		return manufactureName;
	}
	public void setManufactureName(String manufactureName) {
		this.manufactureName = manufactureName;
	}
	public String getManufactureAddres() {
		return manufactureAddres;
	}
	public void setManufactureAddres(String manufactureAddres) {
		this.manufactureAddres = manufactureAddres;
	}
	public String getRegistrationNumber() {
		return registrationNumber;
	}
	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}
	public static manufacturer getmanufacturer(String manufactureName, String manufactureAddres, String registrationNumber)
	{
		return new manufacturer(manufactureName, manufactureAddres, registrationNumber);
	}

}
