package com.java.SeleniumTest;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CurrentDateSelection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DateFormat df = new SimpleDateFormat("d");
		Date date = new Date();
		String todayDate = df.format(date);
		System.out.println(todayDate);
	}

}
