
package com.school;


public class school {
	private String schoolName;
	private String schoolAddress;
	private String schoolMotto;
	public school(String schoolName, String schoolAddress, String schoolMotto) {
		super();
		this.schoolName = schoolName;
		this.schoolAddress = schoolAddress;
		this.schoolMotto = schoolMotto;
	
	}
	public String getSchoolName() {
		return schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	public String getSchoolAddress() {
		return schoolAddress;
	}
	public void setSchoolAddress(String schoolAddress) {
		this.schoolAddress = schoolAddress;
	}
	public String getSchoolMotto() {
		return schoolMotto;
	}
	public void setSchoolMotto(String schholMotto) {
		this.schoolMotto = schholMotto;
	}
	public static school getschoolDetail (String schoolName,String schoolAdress,String schoolMotto )
	{
	return new school ("ashoka" ,"nadipadu","good");
	}
	public String toString() {
	 return "schoolName:"+"["+schoolName+"]"+"schoolAddress:"+"["+schoolAddress+"]"+"schoolMotto"+"["+schoolMotto+"]";
	
	}
	
	


}
