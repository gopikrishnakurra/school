package com.main3;
import com.publisher.*;
import com.book.*;

public class main {
	public static void main(String[]args) 
	{
		publisher pu =publisher.getpublisher("gopi","nadhipadu","car");
		book bo = book.getbook("yogi","gopi", pu, 1222);

		System.out.println(pu);
		System.out.println(bo);
	
	}
	

}
