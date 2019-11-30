package com.bridgelab.util;



import java.util.Scanner;



public class Utility {
	static Scanner sc = new Scanner(System.in);

	/*
	 * static function to check for input integer
	 * 
	 * @return integer of scanner type
	 */
	public static int inputInt() {
		return sc.nextInt();
	}
	/*
	 * static function to check for input String
	 * 
	 * @return String of scanner type
	 */

	public static String inputString() {
		return sc.next();
	}

	/*
	 * static function to close scanner
	 * 
	 */
	public static void closeScanner() {
		sc.close();
	}
	/*
	 * 
	 * 
	 * static function check for inputing long
	 * 
	 * @return long of scanner type
	 * */

	public static long inputLong() 
	{
		return sc.nextLong();
	}
    
	/*
	 * purpose: static function write data into the file
	 * 
	 * @param: passing file name as string and list of data
	 * 
	 * @return: void
	 */
	
	
	public static boolean nameValidation(String str)
	{
		  if( str!=""&&str.matches("[A-Za-z]*"))
		  {
		    return true;	  
		  }
		  return false;
	}
	
	
	
	public static boolean mobileNoValidate(String mobileNo) 
	{
		// TODO Auto-generated method stub
		      return mobileNo.matches("\\d{10}");
	}

	public static double inputDouble() {
		
		return sc.nextDouble();
	}

	public static float inputFloat() {
	
		return sc.nextFloat();
	}

	
	
	
	
}
