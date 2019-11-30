package com.bridgelab.controller;

import com.bridgelab.model.AddressBook;
import com.bridgelab.util.Utility;

public class Demo
{
	public static void main(String[] args)
	{
		
		AddressBook addressBook =new AddressBook();
		
		System.out.println("Enter");
		int n=Utility.inputInt();
		 for(int i=0;i<n;i++)
		 {
			 addressBook.addnewUser();
		 }
		 addressBook.printListOfAddressBook();
//		 addressBook.sortByLastName();
//		 System.out.println("sorted list");
//		 
		// addressBook.printListOfAddressBook();
		// addressBook.writeFile();
		 
	}

}
