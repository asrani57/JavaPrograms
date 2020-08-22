package javaPrograms;

import java.util.Date;
import java.util.Random;

public class randomNumber {
	public static void main(String[] args) {


		//Create a unique username 
		//using Math.random()
		//OR using Random class in java.lang.Random
		//OR using Date timestamp

		//First approach --> using Math.random()
		Double d = Math.random();
		d = d*1000000000;
		int i  = (int) d.intValue();
		//System.out.println(d);

		String userName1 = "Test";
		String temp1 = userName1 + i;
		System.out.println(temp1);

		//Second approach -->Using Random class

		Random random = new Random();
		double db =random.nextDouble();
		db = db*1000000000;
		String userName3 = "Test";
		String temp3 = userName3 + i;
		System.out.println(temp3);


		//Third approach --> using System Date time approach

		Date dt = new Date();
		long date = dt.getTime();
		String userName2 = "Test";
		String temp2 = userName2 + date;
		System.out.println(temp2);	

	}

}
