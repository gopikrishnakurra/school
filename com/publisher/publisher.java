package com.publisher;

public class publisher {
	private String publisherName;
	private String publisherLocation;
	private String LicenseCode;
	private publisher(String publisherName, String publisherLocation, String licenseCode) {
		super();
		this.publisherName = publisherName;
		this.publisherLocation = publisherLocation;
		LicenseCode = licenseCode;
	}
	public String getPublisherName() {
		return publisherName;
	}
	public void setPublisherName(String publisherName) {
		this.publisherName = publisherName;
	}
	public String getPublisherLocation() {
		return publisherLocation;
	}
	public void setPublisherLocation(String publisherLocation) {
		this.publisherLocation = publisherLocation;
	}
	public String getLicenseCode() {
		return LicenseCode;
	}
	public void setLicenseCode(String licenseCode) {
		LicenseCode = licenseCode;
	}
	public String toString() {
		return "publisher [publisherName=" + publisherName + ", publisherLocation=" + publisherLocation
				+ ", LicenseCode=" + LicenseCode + "]";
	}
	public static publisher getpublisher(String publisherName, String publisherLocation, String licenseCode)
	{
		return new publisher (publisherName,  publisherLocation, licenseCode);
	}
	

}
