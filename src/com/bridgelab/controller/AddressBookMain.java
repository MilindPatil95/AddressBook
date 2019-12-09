package com.bridgelab.controller;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import com.bridgelab.model.AddressBook;
import com.bridgelab.model.Person;
import com.bridgelab.util.Utility;
/*
 *@purpose: To crate Book having list of Person detail And maintain search ,sort,edit operation 
 *@author:Milind Patil
 *@Date:
 * */
public class AddressBookMain 
{  List<Person> list;
    public static void main(String[] args) 
    {    AddressBookMain addressBookMain=new AddressBookMain();  //crate address book object
       int choice;  
      do {
    	  System.out.println("Select options=======================");  
    	  System.out.println("1:	Create Address Book");
    	  System.out.println("2:	Open");
    	  System.out.println("3:	Save");
    	  System.out.println("4:	SaveAs");
    	  System.out.println("5:	Print All Entries");
       	  System.out.println("6:	Quit");
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
       	   case 5: addressBookMain.printAllEntries();
	   		break;
       	   case 6: addressBookMain.quit();
	   		break;
       	   default : System.out.println("Enter Proper choice");
       	   			choice=Utility.inputInt();
       	   }
        }while(choice<=5 &&choice>0);  	
     	 
	}
   
	private void printAllEntries()
	{  
		 AddressBook addressBook=new AddressBook();
		 	list=addressBook.readFile();
		 	addressBook.setList(list);
	    	addressBook.printListOfAddressBook(list);
		
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
    		System.out.println("6.		Back to main menu ");
    		System.out.println("Enter your choice");
    		choice=Utility.inputInt();
    	   switch(choice)
    	   {
    	     
			case 1:System.out.println("Enter n no Users you want to addd");
			      int n=Utility.inputInt();
			       list=new ArrayList();
			      list=addressBook.readFile();
			      for(int i=0;i<n;i++)
			      {	  
				    addressBook.addnewUser(list);
			      }
			      System.out.println(n+" New Users are added");
				break;
			case 2: list=addressBook.readFile();
				   if(list!=null)
				   {   
					   System.out.println("Enter user mobile number");  
					   long mobileno=Utility.inputLong();
					   int i=0;
					   for(Person obj :list)
					   {   
			        	  if(obj.getMobileno()==mobileno)
			        	  {
			        		  addressBook.editUser(list,obj,i);
			        	  }
			        	  i++;
			          }
				   }
				   else
				   {
					   list= addressBook.readFile();
					   System.out.println("Enter user mobile number");  
					   long mobileno=Utility.inputLong();
					   int i=0;
					   for(Person obj :list)
					   {
			        	  if(obj.getMobileno()==mobileno)
			        	  {
			        		  addressBook.editUser(list,obj,i);			        	  }
			        	  i++;
			          }
				   }
				   
				break;
			case 3:
                    list=addressBook.readFile();
					addressBook.sortByLastName(list);
					list=addressBook.getList();
				break;
			case 4: list=addressBook.readFile();
					addressBook.sortByZipcode(list);
					list=addressBook.getList();
				break;
			case 5:
				addressBook.printListOfAddressBook(list);
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
    	 System.out.println("File Name 	:"+"Addressbook");
    	 System.out.println("Extension	:"+".json");                 
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
    
    
