package com.main;
import com.school.*;
import com.student.*;

public class main {
	public static void main(String[]arg) {
		// TODO Auto-generated constructor stub
		school sc =school.getschoolDetail("ashka","nadipadu","good");
		student st =student.getsudent("gopi", "a",sc,90.0);
		System.out.println(sc);
		System.out.println(st);
	}

}
