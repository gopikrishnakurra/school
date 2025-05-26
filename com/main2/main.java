package com.main2;
import com.product.*;
import com.manufacturer.*;

public class main {
	public static void main(String[]args)
	{
	manufacturer ma = manufacturer.getmanufacturer("gopi","gogulamudi","24657");
	product pro = product.getproduct("tata","water",ma,20.0);
	System.out.println(ma);
	System.out.println(pro);

}
}
