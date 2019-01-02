package com.webservice;

public class MapUtils {
	public static int sumMapValues(String ints) {
		int sumvalue=0;
		String[] lists=ints.split(ints);
		
		for (String list: lists) {
			
			sumvalue= +Integer.parseInt(list);
		}
		return sumvalue;
	   

	  }

}
