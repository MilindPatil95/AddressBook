package com.bridgelab.controller;



import java.util.List;

import com.bridgelab.model.AddressBook;
import com.bridgelab.model.Person;
import com.bridgelab.util.Utility;

public class Demo
{
	public static void main(String[] args)
	{
		
		AddressBook addressBook =new AddressBook();
		
//		System.out.println("Enter");
//		int n=Utility.inputInt();
//		 for(int i=0;i<n;i++)
//		 {
//			 addressBook.addnewUser();
//		 }
//		 addressBook.printListOfAddressBook();
//		 addressBook.sortByLastName();
//   		 System.out.println("sorted list");		 
//	   addressBook.printListOfAddressBook();
//	   List<Person> list=addressBook.getList();
//	      addressBook.writeFile(list);
		List<Person> list =addressBook.readFile();
		
		addressBook.setList(list);
		addressBook.printListOfAddressBook(list);
                   		 
	}

}
