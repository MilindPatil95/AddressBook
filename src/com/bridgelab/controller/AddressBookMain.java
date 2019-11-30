package com.bridgelab.controller;

import java.util.List;

import com.bridgelab.model.AddressBook;
import com.bridgelab.model.Person;
import com.bridgelab.util.Utility;

public class AddressBookMain 
{  static List<Person> list;
    public static void main(String[] args) 
    {    AddressBookMain addressBookMain=new AddressBookMain();
       int choice;  
      do {
    	  System.out.println("Select options=======================");
    	  System.out.println("1:	Create Address Book");
    	  System.out.println("2:	Open");
    	  System.out.println("3:	Save");
    	  System.out.println("4:	SaveAs");
       	  System.out.println("5:	Quit");
       	  System.out.println("Enter your choice");
       	   choice=Utility.inputInt();
       	   switch(choice)
       	   {
       	  
       	   case 1:	addressBookMain.createNewAddressBook();
       	   		break;
       	   case 2:	addressBookMain.open();
       	   		break;
       	   case 3:  addressBookMain.save();
       	   		break;
       	   case 4:  addressBookMain.saveAs();
       	   		break;
       	   case 5: addressBookMain.quit();
       	   		break;
       	   case 6: addressBookMain.printAllEntries();
	   		break;
       	   default : System.out.println("Enter Proper choice");
       	   			choice=Utility.inputInt();
       	   }
        }while(choice<=5 &&choice>0);  	
     	 
	}
   
	private void printAllEntries()
	{
		 AddressBook addressBook=new AddressBook();
	    	addressBook.printListOfAddressBook();
		
	}

	private void createNewAddressBook()
    {
    	 
    	int choice;
    	do
    	{	AddressBook addressBook=new AddressBook();
    		System.out.println("Select Option: ---------------->>>>>>>>>>>>>>>>>>>>");
    		System.out.println("1.		Add new User");
    		System.out.println("2.		Edit User Data");
    		System.out.println("3.		Sort Users by Last Name ");
    		System.out.println("4.		Sort Users by ZipCode");
    		System.out.println("5.		Print List of Users ");
    		System.out.println("Enter your choice");
    		choice=Utility.inputInt();
    	   switch(choice)
    	   {
    	     
			case 1:System.out.println("Enter n no Users you want to addd");
			      int n=Utility.inputInt();
			      for(int i=0;i<n;i++)
			      {	  
				    addressBook.addnewUser();
			      }
			      list=addressBook.getList();
			      System.out.println(n+"Users are added");
				break;
			case 2: 
				   //addressBook.editUser();
				break;
			case 3:
				addressBook.sortByLastName();
				break;
			case 4:
				addressBook.sortByZipcode();
				break;
			case 5:
				addressBook.printListOfAddressBook();
				break;
			case 6:
				   break;
			default : System.out.println("Enter Proper choice");
			    choice=Utility.inputInt();
    	   }
    	}while(choice<5 && choice>0);
         

    	
    }
    private void open()
    {
    	
    }
    private void save()
    { 		
    	AddressBook addressBook =new AddressBook();
    	addressBook.writeFile(list);
    }
    private void saveAs()

    {
    	
    }
    private void quit() 
    {
		 System.exit(0);
		
	}
    
}    
    
    
