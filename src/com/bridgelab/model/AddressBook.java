package com.bridgelab.model;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.bridgelab.repository.JsonAddressBookConnection;
import com.bridgelab.util.Utility;

public class AddressBook
{ 
  JsonAddressBookConnection connection=new JsonAddressBookConnection();

  List<Person> list=new ArrayList<Person>();
	String filename="Addressbook.json";
   public void  addnewUser()
   {  
	   Person person =new Person();
       System.out.println("Enter Firstname");
       person.setName(Utility.inputString());
       System.out.println("Enter LastName");
       person.setLastname(Utility.inputString());
       System.out.println("Enter State");
       person.setState(Utility.inputString());
       System.out.println("Enter City");
       person.setCity(Utility.inputString());
       System.out.println("Enter Zipcode");
       person.setZipcode(Utility.inputString());
       
       System.out.println("Enter Mobile Number");
       person.setMobileno(Utility.inputLong());
       System.out.println("Enter address");
       person.setAddress(Utility.inputString());       
       list.add(person);

      
   }
   public void editUser(int pos)
   {    
	   Person editp=list.get(pos-1);
	   System.out.println("Enter your choice");
	   System.out.println("1 :	LastName");
       System.out.println("2 :	State");
       System.out.println("3 :	City");
       System.out.println("4 :	Zipcode");       
       System.out.println("5 :	Mobile Number");
       System.out.println("6 :	address");
       System.out.println("7 :	Exit");
	   int ch=Utility.inputInt();
	   switch(ch)
	   {
	   case 1:
		   	 editp.setLastname(Utility.inputString());
		     break;
	   case 2: 
		   	 editp.setState(Utility.inputString());
		     break;
	   case 3: 
		     editp.setCity(Utility.inputString());
		     break;
	   case  4: editp.setZipcode(Utility.inputString());
		     break;
	   case   5: editp.setMobileno(Utility.inputLong());
		    break;
	   case 6:
		     editp.setAddress(Utility.inputString());
	         break;
	   case 7:
		       break;
	       
	   }
	   list.set(pos-1,editp);
   }
   
   public void sortByLastName()
   {
	  
	  list=list.stream().sorted((list1,list2) -> list1.getLastname().compareTo(list2.getLastname())).collect(Collectors.toList());

   }
   public void sortByZipcode()
   {
	   list=list.stream().sorted((list1,list2) -> list1.getZipcode().compareTo(list2.getZipcode())).collect(Collectors.toList());
	 
   }
   public void printListOfAddressBook()

   {  int i=1;
	   for(Person person:list)
	   {
		   System.out.println("USER :"+i);
		   System.out.println("Firstname	 :"+person.getName());
	       System.out.println("LastName		 :"+person.getLastname());
	   	   System.out.println("State		 :"+person.getState());
	       System.out.println("City			 :"+person.getCity());	   
	       System.out.println("Enter Zipcode :"+person.getZipcode());   
	       System.out.println("Enter Mobile Number"+person.getMobileno());
	     
	       	  i++;
	   }
   }

  public void writeFile(List<Person> list1)
  {
	  connection.writeFile(filename,list1);
  }
  
  public List<Person> readFile()

  {
	  return connection.readFile(filename);
  }
  public List<Person> getList()
  {
	   return list;
	    
  }  
  
//  public void setList(List<Person> list1)
//  {
//	  List<Person>  list=list1;
//	    
//  } 
  
}
